package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		int d=UtilityScanner.readInteger();
		int m=UtilityScanner.readInteger();
		int y=UtilityScanner.readInteger();
		int day=UtilityLogics.dayofweek(d,m,y);
		System.out.println(day);
	}
}
