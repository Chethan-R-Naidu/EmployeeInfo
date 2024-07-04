package com.learn.springboot.EmployeeServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learn.springboot.EmployeeEntities.EmployeeEntity;
import com.learn.springboot.EmployeeRepositories.EmployeeRepository;

@Service
public class EmployeeServicesImplementation implements EmployeeServices{

	EmployeeRepository er;
	
	
	public EmployeeServicesImplementation(EmployeeRepository er) {
		super();
		this.er = er;
	}

	@Override
	public String createEmp(EmployeeEntity e) {
		er.save(e);
		return "Employee object is created and saved";
	}

	@Override
	public List<EmployeeEntity> getAllEmpInfo() {
		List<EmployeeEntity> l = er.findAll();
		return l;
	}

	@Override
	public EmployeeEntity getEmpInfo(String empid) {
		EmployeeEntity ee = er.findById(empid).get();
		return ee;
	}
	

	@Override
	public String updateEmpInfo(EmployeeEntity e) {
		if(er.existsById(e.getEmpid())) {
			er.save(e);
			return "Employee object is updated and saved";
		}
		else {
			return "Employee object is not avaliable";
		}
		
	}

	@Override
	public String deleteEmpInfo(String empid) {
		er.deleteById(empid);
		return "Object is deleted.";
	}

}
