package org.PankajLearn;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class SampleDemo {

	public static void main(String[] args) {
		//Vector<Integer> v= new Vector<>();
		List<Integer> v=new ArrayList<>();
		List l=new LinkedList<>();
		l.add("1");
		l.add("3");
		l.add("pankaj");
		l.add("madhu");
		l.add("khsuhi");
	System.out.println("the element of listitertor");
	ListIterator itr= l.listIterator();
	while(itr.hasNext())
	{
		String s=(String)itr.next();
		if(s.equals("madhu"))
		{
			itr.set("puddu");
		
		}
			
			
	}
	System.out.println(l);
	
//	while(itr.hasPrevious())
//	{
//		Integer no=(Integer) itr.previous();
//		System.out.println(no);
//		if(no.equals(4))
//		{
//			itr.remove();
//			System.out.println(no);
//		}
//		
//	}
	
	v.add(10);
		v.add(20);
		v.add(5);
		v.add(16);
		v.add(5);
		v.add(7);
		v.add(3, 9);
		System.out.println("the elements present is the vector");
		//Enumeration<Integer> e=v.elements();
		//while (e.hasMoreElements()) {
			//System.out.println(e.nextElement());
		//}
		Iterator<Integer> iterator=v.iterator();
		while(iterator.hasNext())
		{
			Integer i=iterator.next();
			if(i%2==0)
				iterator.remove();
		}
		System.out.println(v);
	
	}

}
