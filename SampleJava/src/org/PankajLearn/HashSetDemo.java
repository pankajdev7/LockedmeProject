package org.PankajLearn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> h=new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(20);
		h.add(30);
		System.out.println(h);

		
		Set<Integer> h1=new LinkedHashSet<>();
		h1.add(10);
		h1.add(30);
		h1.add(40);
		h1.add(20);
		System.out.println(h1);
		Set<Emp> employees =new HashSet<>();
		employees.add(new Emp(1, "Pankaj", "bhpal"));
		employees.add(new Emp(5, "Pankaj", "bhpal"));
		employees.add(new Emp(4, "puddu", "bhpal"));
		employees.add(new Emp(3, "Pankaj", "bhpal"));
		//System.out.println(employees);
		for(Emp e:employees)
		{
			System.out.println(e);
		}
	}

}
