package com.arth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arth.entity.TechnologyEntity;

@Repository
public interface TechnologyRepository extends JpaRepository<TechnologyEntity, Integer>{

}
