package com.shozo.webapp.EmployeeMgmt.ws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shozo.webapp.EmployeeMgmt.entities.Employee;
import com.shozo.webapp.EmployeeMgmt.service.EmployeeService;

@RestController
@RequestMapping(value="employee")
public class EmployeeWs {
	
	int a = 20;
	List<String> myList = new ArrayList<String>(Arrays.asList("shozo","pozo"));
	
	@Autowired
	EmployeeService employeeService;
	
	
	public Employee getCustomer() {
		return null;	
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return employeeService.saveEmployee(employee);
		
	}
	
	@RequestMapping(value="all",produces="application/json",method=RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		
		System.out.println("reached in getAllEmployees ");
		 return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="{id}",produces="application/json",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable Long id) {
		
		return employeeService.getEmployee(id);
		
	}
	
	
/*	@RequestMapping(value="modify",produces="text/plain",method=RequestMethod.GET)
	public String modifyValue() {
		
		a = 30;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return String.valueOf(a);
	}
	
	@RequestMapping(value="read",produces="text/plain",method=RequestMethod.GET)
	public String readValue() {
		
		return String.valueOf(a);
	}*/
	
	@RequestMapping(value="modify",produces="application/json",method=RequestMethod.GET)
	public List<String> modifyValue() {
		
		myList.add("shahrukh");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myList;
	}
	
	@RequestMapping(value="read",produces="application/json",method=RequestMethod.GET)
	public List<String> readValue() {
		
		return myList;
	}

}
