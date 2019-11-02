package com.howtodoinjava.core.autowire.bytype;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean
{
	private String fullName;
	
	@Autowired
	private DepartmentBean departmentBean;

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
