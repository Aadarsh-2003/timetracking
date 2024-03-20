package com.arth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arth.entity.ProjectEntity;
import com.arth.entity.UsersEntity;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
	
	@Query(value="select p.* from project p , project_user pu where p.project_id = pu.project_id and pu.user_id = :userId",nativeQuery = true)
	List<ProjectEntity> getProjectByUserId(Integer userId);
	
	@Query(value="select count(*) from project p",nativeQuery = true)
	Integer getProjects();
	
	@Query(value="select count(*) from project p where project_status_id = 4 ",nativeQuery = true)
	Integer getOngoingProjects();
	
	@Query(value="select count(*) from project p where project_status_id = 2",nativeQuery = true)
	Integer getPipelineProjects();
	
	@Query(value="select count(*) from project p where :month >= month(project_completion_date) and :day >= day(project_completion_date)",nativeQuery = true)
	Integer getdueProjects(Integer month, Integer day);

}
