package com.cruds.db;

import com.cruds.bean.Department;

public interface DepartmentDAO {
	
	//public void setDataSource(DataSource ds);
	
	public void create(Integer deptId, String deptName);
	
	public Department getDept(Integer deptId);

}
