package com.arth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arth.entity.TaskUserEntity;
@Repository
public interface TaskUserRepository extends JpaRepository<TaskUserEntity, Integer>{

}
