package com.bridgelabz.BasicCorePrograms;

import com.bridgelabz.utility.*;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		int year=UtilityScanner.readInteger();
		boolean isyear=UtilityLogics.isLeapYear(year);
		String print=(isyear==true)? "leap year" : "not a leap year";
		if(isyear==true)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	}
}