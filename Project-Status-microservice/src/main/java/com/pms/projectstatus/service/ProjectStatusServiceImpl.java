package com.pms.projectstatus.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.pms.projectstatus.dao.ProjectStatusRepository;
import com.pms.projectstatus.dto.ProjectStatusDTO;
import com.pms.projectstatus.model.ProjectStatus;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectStatusServiceImpl implements ProjectStatusService {

	private final ProjectStatusRepository projectStatusRepository;
	private final ModelMapper modelMapper;

	@Override
	public List<ProjectStatus> getAllProjectStatus() {
		return this.projectStatusRepository.findAll();
	}

	@Override
	public String getProjectStatusById(int projectStatusId) {
		return this.projectStatusRepository.findByProjectStatusId(projectStatusId).getStatus();
	}

	@Override
	public List<ProjectStatusDTO> getAllProjectStatusDTOs() {
		List<ProjectStatus> projectStatus=getAllProjectStatus();
		List<ProjectStatusDTO> projectStatusDTOs=projectStatus.stream().map( project -> modelMapper.map(project, ProjectStatusDTO.class)).toList();
		return projectStatusDTOs;
	}
}
