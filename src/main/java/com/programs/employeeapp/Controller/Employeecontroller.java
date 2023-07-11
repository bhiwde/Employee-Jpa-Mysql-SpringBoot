package com.programs.employeeapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EmployeApp")

public class Employeecontroller {
	@GetMapping("/home")
	public String home() {
		return "Welcome To Employee App";
		
	}

}
