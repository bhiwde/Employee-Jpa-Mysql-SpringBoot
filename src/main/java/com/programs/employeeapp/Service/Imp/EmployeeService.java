package com.programs.employeeapp.Service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programs.employeeapp.Model.EmployeeModel;
import com.programs.employeeapp.Repo.IEmployeerepo;
import com.programs.employeeapp.Service.IEmployeeinterface;
import com.programs.employeeapp.entity.EmployeeEntity;

@Service
public class EmployeeService implements IEmployeeinterface {
@Autowired
IEmployeerepo iemployeerepo;
	@Override
	public String addemp(EmployeeModel employeemodel) {
		// TODO Auto-generated method stub
		
		EmployeeEntity employeeentity = new EmployeeEntity();
		employeeentity.setEid(employeemodel.getEid());
		employeeentity.setName(employeemodel.getName());
		employeeentity.setDepartment(employeemodel.getDepartment());;
		employeeentity.setSalary(employeemodel.getSalary());
		employeeentity.setDob(employeemodel.getDob());
		employeeentity.setAge(employeemodel.getAge());
		iemployeerepo.save(employeeentity);
		return "Successfully Added....";
	}

}
