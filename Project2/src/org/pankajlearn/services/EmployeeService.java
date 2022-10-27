package org.pankajlearn.services;

import java.util.List;

import org.pankajlearn.Emp;

public interface EmployeeService {
	void insertEmpoloyee(Emp e);
	void deleteEmployee(int eno);
	List<Emp> getEmployees();
	Emp getEmployee(int eno);
}
