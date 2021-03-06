package com.training.boot.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.training.boot.model.Project;
import com.training.boot.service.IProjectServiceImpl;

//@Repository
public class IProjectRepositoryImpl implements IProjectRepository {

	// Collections are used for in-memory storage of data
	Logger logger = LoggerFactory.getLogger(IProjectServiceImpl.class);
	List<Project> projects;

	public IProjectRepositoryImpl() {
		logger.info("ÏProjectRepository Object instantiated..");
		this.projects = new ArrayList<>();
	}

	@Override
	public Optional<Project> findById(long id) {
		// JDBC or JPA 
		for (Project project : projects) {
			if (project.getId() == id) {
				return Optional.ofNullable(project);
			}
		}

		return null;
	}

	@Override
	public Project save(Project project) {
		projects.add(project);
		return project;
	}
}
