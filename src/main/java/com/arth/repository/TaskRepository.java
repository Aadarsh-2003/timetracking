package com.arth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arth.entity.TaskEntity;
@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer>{

}
