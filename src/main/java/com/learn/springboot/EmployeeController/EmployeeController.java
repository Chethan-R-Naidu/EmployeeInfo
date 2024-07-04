package com.learn.springboot.EmployeeController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.learn.springboot.EmployeeEntities.EmployeeEntity;
import com.learn.springboot.EmployeeServices.EmployeeServices;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	EmployeeServices es;

	public EmployeeController(EmployeeServices es) {
		super();
		this.es = es;
	}
	
	@PostMapping
	public String createEmp(@RequestBody EmployeeEntity e) {
		String msg = es.createEmp(e);
		return msg;
	}
	
	@GetMapping(value = "{empid}")
	public EmployeeEntity getEmpInfo(@PathVariable String empid) {
		EmployeeEntity e = es.getEmpInfo(empid);
		return e;
	}
	
	@GetMapping
	public List<EmployeeEntity> getAllEmpInfo() {
		List<EmployeeEntity> le = es.getAllEmpInfo();
		return le;
	}
	
	@DeleteMapping(value = "{empid}")
	public String deleteEmpInfo(@PathVariable String empid) {
		String s = es.deleteEmpInfo(empid);
		return s;
	}
	
	@PutMapping(value = "{empid}")
    public String updateEmpInfo(@RequestBody EmployeeEntity e) {
       String s = es.updateEmpInfo(e);
       return s;
    }

}
