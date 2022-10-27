package org.PankajLearn;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingDemo {

	public static void main(String[] args) {
		Set<Emp> t= new TreeSet<>(new Comparator<Emp>() {

			@Override
			public int compare(Emp e1, Emp e2) {
				// TODO Auto-generated method stub
				return -e1.getName().compareTo(e2.getName());
			}
		});
		t.add(new Emp(1,"Pnkaj", "bhopal"));
		t.add(new Emp(4,"Pnkaj2", "indore"));
		t.add(new Emp(3,"madhu", "bhopal"));
		t.add(new Emp(2,"Puddu", "bhopal"));
		for (Emp e:t)
		{
			System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
		}
		
	}

}
