package com.bridgelabz.BasicCorePrograms;

import com.bridgelabz.utility.*;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		int pow=UtilityScanner.readInteger();
		long val=UtilityLogics.powerof2(pow);
		System.out.println(val);
	}
}