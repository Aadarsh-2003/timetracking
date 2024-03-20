package com.arth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arth.entity.ModuleEntity;
import com.arth.entity.ProjectEntity;
@Repository
public interface ModuleRepository extends JpaRepository<ModuleEntity, Integer>{
	
	@Query(value="select m.* from modules m , project p where m.project_id = p.project_id and p.project_id = :projectId",nativeQuery = true)
	List<ModuleEntity> getModuleByProjectId(Integer projectId); 

}
