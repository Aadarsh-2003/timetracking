package com.arth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class ProjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	private String projectTitle;
	private String description;
	private Integer projectStatusId;
	private String docURL;
	private String estimatedHours;
	private String totalUtilizedHours;
	private String projectStartDate;
	private String projectCompletionDate;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getProjectStatusId() {
		return projectStatusId;
	}

	public void setProjectStatusId(Integer projectStatusId) {
		this.projectStatusId = projectStatusId;
	}

	public String getDocURL() {
		return docURL;
	}

	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}

	public String getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(String estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public String getTotalUtilizedHours() {
		return totalUtilizedHours;
	}

	public void setTotalUtilizedHours(String totalUtilizedHours) {
		this.totalUtilizedHours = totalUtilizedHours;
	}

	public String getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public String getProjectCompletionDate() {
		return projectCompletionDate;
	}

	public void setProjectCompletionDate(String projectCompletionDate) {
		this.projectCompletionDate = projectCompletionDate;
	}

}
