package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.*;
public class Distance 
{
	public static void main(String[] args) 
	{
		double x=UtilityScanner.readDouble();
		double y=UtilityScanner.readDouble();
		double result=UtilityLogics.distance(x, y);
		System.out.println(result);
	}
}