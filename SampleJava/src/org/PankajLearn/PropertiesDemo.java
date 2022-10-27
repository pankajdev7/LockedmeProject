package org.PankajLearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SampleJava\\src\\org\\PankajLearn\\abc.properties");
		Properties properties=new Properties();
		properties.load(fis); 
		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("address"));
		System.out.println(properties.getProperty("loc"));
		
		
	}

}
