package org.pankajlearn;

import java.util.List;

import org.pankajlearn.services.EmployeeService;
import org.pankajlearn.services.EmployeeServiceCollectionImpl;

public class TestColl {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceCollectionImpl();
		service.insertEmpoloyee(new Emp(1,"pankaj", "bhopal"));
		service.insertEmpoloyee(new Emp(2,"Madhu", "jabalpur"));
		
		service.deleteEmployee(3);
		List<Emp> employees=service.getEmployees();
		System.out.println("the empolyees are");
		for (Emp e:employees)
		{
			System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
			System.out.println(e);//e.toString() default method
		}
		
		
		
	}

}
