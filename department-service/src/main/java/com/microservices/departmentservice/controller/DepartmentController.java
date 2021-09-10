package com.microservices.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.service.DepartementService;


@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartementService departementService;
	
	
	//creating method to save department object
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.err.println("Inside Department Controller");
		return departementService.saveDepartment(department);
	}
	
	//creating method to fetch departmentById
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		return departementService.findDepartmentById(departmentId);
	}
}
