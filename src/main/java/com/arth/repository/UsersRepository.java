package com.arth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arth.entity.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer>{
	
	UsersEntity findByEmailAndPassword(String email,String password);
	
	UsersEntity findByEmail(String email);
	
	@Query(value="select u.* from users u , project_user pu where u.user_id = pu.user_id and pu.project_id = :projectId",nativeQuery = true)
	List<UsersEntity> getUsersByProjectId(Integer projectId);
	
	@Query(value="select u.* from users u , modules m , project p , project_user pu where p.project_id = m.project_id and pu.project_id = p.project_id and u.user_id = pu.user_id and m.module_id = :moduleId",nativeQuery = true)
	List<UsersEntity> getUsersByModuleId(Integer moduleId);
	
	@Query(value="select u.* from users u , task_user tu where u.user_id = tu.user_id and tu.task_id = :taskId",nativeQuery = true)
	List<UsersEntity> getUsersByTaskId(Integer taskId);

}
