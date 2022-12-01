package com.pms.projectstatus.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.pms.projectstatus.dto.ProjectStatusDTO;
import com.pms.projectstatus.model.ProjectStatus;
import com.pms.projectstatus.service.ProjectStatusService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api/v1/status")
public class ProjectStatusController {
	
	private final ProjectStatusService projectStatusService;
	
	@GetMapping("/{projectStatusId}")
	public String getProjectStatusById(@PathVariable int projectStatusId) {
		return this.projectStatusService.getProjectStatusById(projectStatusId);
	}
	
	@GetMapping("/")
	public List<ProjectStatus> getAllProjectStatus(){
		return this.projectStatusService.getAllProjectStatus();
	}
	
	
	@GetMapping("/dtos")
	public List<ProjectStatusDTO> getAllProjectStatusDTOs(){
		return this.projectStatusService.getAllProjectStatusDTOs();
	}

}
