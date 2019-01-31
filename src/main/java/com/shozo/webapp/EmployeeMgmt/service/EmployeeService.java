package com.shozo.webapp.EmployeeMgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shozo.webapp.EmployeeMgmt.dao.EmployeeDao;
import com.shozo.webapp.EmployeeMgmt.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public Employee getEmployee(Long id) {
		
		return employeeDao.findOne(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeDao.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		
		List<Employee> employees = new ArrayList<>();
		 employeeDao.findAll().forEach(e -> employees.add(e));
		 return employees;
	}
	
	
	
	
}
