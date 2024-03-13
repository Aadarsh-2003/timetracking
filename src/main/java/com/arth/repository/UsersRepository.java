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

}
