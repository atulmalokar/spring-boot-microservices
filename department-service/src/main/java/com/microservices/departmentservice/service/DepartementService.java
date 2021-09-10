package com.microservices.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.departmentservice.entity.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;

@Service
public class DepartementService {

	@Autowired
	private DepartmentRepository  departmentRepository;

	//implementing save department method to save department object
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
	//implementing find department by id method to fetch data from database
	public Department findDepartmentById(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}
}
