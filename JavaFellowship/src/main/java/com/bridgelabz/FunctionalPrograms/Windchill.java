package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class Windchill 
{
	public static void main(String[] args) 
	{
		double t=UtilityScanner.readDouble();
		double v=UtilityScanner.readDouble();
		double result=UtilityLogics.windchill(t, v);
		System.out.println(result);
	}
}