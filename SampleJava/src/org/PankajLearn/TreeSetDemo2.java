package org.PankajLearn;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		 
		Set<String> fruits=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				// TODO Auto-generated method stub
				return -str1.compareTo(str2);
			}
			
		});
		fruits.add("banana");
		fruits.add("Oragne");
		fruits.add("grapes");
		System.out.println(fruits);

	}

}
class FruitCompare implements Comparator<String>
{

	@Override
	public int compare(String str1, String str2) {
		
		return -str1.compareTo(str2);
	}
	
}