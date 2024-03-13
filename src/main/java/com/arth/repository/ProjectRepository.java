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

}
