package com.arth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arth.entity.ProjectEntity;
import com.arth.entity.ProjectUserEntity;
@Repository
public interface ProjectUserRepository extends JpaRepository<ProjectUserEntity, Integer>{
	
	List<ProjectUserEntity> findByUserId(Integer userId);  

}
