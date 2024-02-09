package com.arth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project_user")
public class ProjectUserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectUserId;
	private Integer userId;
	private Integer taskId;
	private Integer assignStatus;

	public Integer getProjectUserId() {
		return projectUserId;
	}

	public void setProjectUserId(Integer projectUserId) {
		this.projectUserId = projectUserId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getAssignStatus() {
		return assignStatus;
	}

	public void setAssignStatus(Integer assignStatus) {
		this.assignStatus = assignStatus;
	}

}
