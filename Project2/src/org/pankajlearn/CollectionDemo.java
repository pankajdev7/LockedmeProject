package org.pankajlearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("hello");
		l.add(10);
		l.add(true);
		l.add(null);
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		l.add("hello");
		
		System.out.println(l);
		l.remove(2);
		l.add(2,"Madhu");
		System.out.println(l);
		
		ArrayList a =new ArrayList<>();
		a.add("hello");
		a.add(10);
		System.out.println(a);
		LinkedList<String> l2= new LinkedList<String>();
		l2.add("hellp");
		l2.add(null);
		l2.add(1,"madhu");
		l2.add("madhu");
		l2.set(2, "Pankaj");
		l2.addFirst("chimkandi");
		l2.addAll(1, l2);
		System.out.println(l2);
		
		Vector v=new Vector<>();
		System.out.println(v.capacity());
		for(int i=1; i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("h");
		v.addElement(2);
		v.removeElement(3);
		System.out.println(v);
		System.out.println(v.capacity());
		
		Stack s=new Stack();
		s.push("A");
		s.push("b");
		s.push("d");
		s.push("f");
		s.pop();
		System.out.println(s);
		System.out.println(s.search("e"));
		System.out.println(s.peek());
	
		
	}
	

}
