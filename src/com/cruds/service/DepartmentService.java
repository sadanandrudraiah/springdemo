package com.cruds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.bean.Department;
import com.cruds.db.DepartmentDAO;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO dao;

	public void setDao(DepartmentDAO dao) {
		this.dao = dao;
	}

	public void create(Integer deptId, String deptName)
	{
		dao.create(deptId, deptName);
	}
	
	public Department getDept(Integer deptId)
	{
		return dao.getDept(deptId);
	}
	
}
