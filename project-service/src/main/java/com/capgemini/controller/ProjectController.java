package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.entity.Project;
import com.capgemini.model.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@PostMapping("/projects")
	public Project saveProject(@RequestBody Project project) {
		return projectService.saveProject(project);
	}
	
	@PostMapping("/projects/bulk")
	public List<Project> saveProject(@RequestBody List<Project> projects) {
		return projectService.saveProjects(projects);
	}
	

}
