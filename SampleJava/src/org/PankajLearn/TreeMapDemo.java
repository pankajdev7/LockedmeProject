package org.PankajLearn;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m =new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
			
		});
		m.put(10, "apple");
		m.put(5, "Banana");
		m.put(20, "Orange");
		m.put(30, "Grapes");
		System.out.println(m);
	}

}
