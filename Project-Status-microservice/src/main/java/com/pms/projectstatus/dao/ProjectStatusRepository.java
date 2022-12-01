package com.pms.projectstatus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.projectstatus.model.ProjectStatus;

@Repository
public interface ProjectStatusRepository extends JpaRepository<ProjectStatus, Integer> {

	public ProjectStatus findByProjectStatusId(int projectStatusId);
}
