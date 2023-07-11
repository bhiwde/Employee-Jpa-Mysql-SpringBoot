package com.programs.employeeapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programs.employeeapp.Model.EmployeeModel;
import com.programs.employeeapp.Service.IEmployeeinterface;

@RestController
@RequestMapping("/EmployeApp")

public class Employeecontroller {
	@GetMapping("/home")
	public String home() {
		return "Welcome To Employee App";
		}
	
	@Autowired
	IEmployeeinterface employeeservice;
	@PostMapping("/addemp")
	public String addemp(@RequestBody EmployeeModel employeemodel) {
		// TODO Auto-generated method stub
		return	employeeservice.addemp(employeemodel);
	
	}
	
}
