package com.bridgelabz.BasicCorePrograms;

import com.bridgelabz.utility.*;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		int range=UtilityScanner.readInteger();
		double result=UtilityLogics.harmonic(range);
		System.out.println(result);
	}
}