package com.learn.springboot.EmployeeServices;

import java.util.List;

import com.learn.springboot.EmployeeEntities.EmployeeEntity;

public interface EmployeeServices {

	public String createEmp(EmployeeEntity e);
	
	public List<EmployeeEntity> getAllEmpInfo();
	
	public EmployeeEntity getEmpInfo(String empid);
	
	public String updateEmpInfo(EmployeeEntity e);
	
	public String deleteEmpInfo(String empid);
	
}
