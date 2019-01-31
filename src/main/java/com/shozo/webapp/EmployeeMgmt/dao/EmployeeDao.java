package com.shozo.webapp.EmployeeMgmt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.shozo.webapp.EmployeeMgmt.entities.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {
	
	public Employee findByFirstName(String firstName);
	
	public Employee findByDepartment(String department);

}
