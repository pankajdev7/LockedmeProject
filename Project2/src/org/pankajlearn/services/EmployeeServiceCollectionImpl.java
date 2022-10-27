package org.pankajlearn.services;

import java.util.ArrayList;
import java.util.List;

import org.pankajlearn.Emp;

public class EmployeeServiceCollectionImpl implements EmployeeService {
	private List<Emp> employees = new ArrayList<>();
	@Override
	public void insertEmpoloyee(Emp e) {
	employees.add(e);
	}

	@Override
	public void deleteEmployee(int eno) {
		Emp e=null;
		for (Emp e1:employees)
		{
			if(e1.getEno()==eno)
			{
				e=e1;
			}
		}
		employees.remove(e);
	}

	@Override
	public List<Emp> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Emp getEmployee(int eno) {
		Emp e1=null;
		for(Emp e:employees)
		{
			if(e.getEno()==eno)
			{
				e1=e;
			}
		}
		return e1;
	}

}
