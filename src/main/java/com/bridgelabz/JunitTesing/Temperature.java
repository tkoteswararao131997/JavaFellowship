package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class Temperature 
{
	public static void main(String[] args) 
	{
		double f=UtilityScanner.readDouble();
		double result=UtilityLogics.temperature(f);
		System.out.println(result);
	}
}
