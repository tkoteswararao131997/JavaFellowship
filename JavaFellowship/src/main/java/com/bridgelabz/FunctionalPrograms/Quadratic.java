package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class Quadratic 
{
	public static void main(String[] args)
	{
		int a=UtilityScanner.readInteger();
		int b=UtilityScanner.readInteger();
		int c=UtilityScanner.readInteger();
		double root1=UtilityLogics.quadraticroot1(a, b, c);
		double root2=UtilityLogics.quadraticroot2(a, b, c);
		System.out.println(root1+" "+root2);
		
	}
}