package com.arth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="Technology")
public class TechnologyEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer TechnologyId;
	private String Title;
	public Integer getTechnologyId() {
		return TechnologyId;
	}
	public void setTechnologyId(Integer technologyId) {
		TechnologyId = technologyId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
}