package org.pankajlearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntInputStreamDemo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int a,b;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the value for a and b");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			System.out.println("The sum is"+(a+b));
				
		}
		catch (NumberFormatException e)
		{
			System.out.println("Please enter correct data");
		}
	}

}
