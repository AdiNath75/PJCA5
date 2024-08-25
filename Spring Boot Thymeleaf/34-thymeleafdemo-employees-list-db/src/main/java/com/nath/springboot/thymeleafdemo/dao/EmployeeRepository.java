package com.nath.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nath.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> {

}
