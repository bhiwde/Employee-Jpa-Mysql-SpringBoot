package com.programs.employeeapp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programs.employeeapp.entity.EmployeeEntity;

@Repository
public interface IEmployeerepo extends JpaRepository<EmployeeEntity,Integer> {

}
