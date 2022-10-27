package org.PankajLearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<>();
		m.put(10, "Pankaj");
		m.put(20, "madhu");
		m.put(10, "watermelon");
		Set<Integer> keys=m.keySet();
		for(int key:keys)
		{
			System.out.println(key+"->"+m.get(key));
		} 
		/*Collection<String> values=m.values();
		for(String value:values)
		{
			System.out.println(value);
		}*/
		Set<Map.Entry<Integer, String>> entries= m.entrySet();
		for(Map.Entry<Integer, String> entry:entries)
		{
				if (entry.getKey()==20)
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
