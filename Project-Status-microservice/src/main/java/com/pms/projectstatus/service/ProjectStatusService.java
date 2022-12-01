package com.pms.projectstatus.service;

import java.util.List;

import com.pms.projectstatus.dto.ProjectStatusDTO;
import com.pms.projectstatus.model.ProjectStatus;

public interface ProjectStatusService {

	public List<ProjectStatus> getAllProjectStatus();

	public String getProjectStatusById(int projectStatusId);

	public List<ProjectStatusDTO> getAllProjectStatusDTOs();
}
