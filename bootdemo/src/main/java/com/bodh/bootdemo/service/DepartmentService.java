package com.bodh.bootdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodh.bootdemo.entity.Department;
import com.bodh.bootdemo.repository.DepartmentDAO;

@Service
public class DepartmentService 
{
	@Autowired
	DepartmentDAO departmentdao;
	public Department getDepartmentByDepartmentId(int departmentId)
	{
		Optional<Department> od=departmentdao.findById(departmentId);
		if(od.isPresent())
			return od.get();
		throw new RuntimeException("Department record does not Exist");
	
	
	}
}
