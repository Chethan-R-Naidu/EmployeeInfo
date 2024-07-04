package com.learn.springboot.EmployeeRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.EmployeeEntities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>{

}
