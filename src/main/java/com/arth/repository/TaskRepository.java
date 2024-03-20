package com.arth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arth.entity.TaskEntity;
@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{
	
	@Query(value="select t.* from tasks t , modules m , project p where t.module_id = m.module_id and m.project_id = p.project_id and m.module_id = :moduleId",nativeQuery = true)
	List<TaskEntity> getTaskByModuleId(Integer moduleId); 


}
