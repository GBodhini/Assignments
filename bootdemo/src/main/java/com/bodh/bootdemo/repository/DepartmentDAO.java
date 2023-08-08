package com.bodh.bootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bodh.bootdemo.entity.Department;

public interface DepartmentDAO  extends JpaRepository<Department,Integer>{

}
