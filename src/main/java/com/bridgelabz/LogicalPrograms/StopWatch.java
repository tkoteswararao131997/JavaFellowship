package com.bridgelabz.LogicalPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		String StartTime="13:18:21";
		String EndTime="14:16:54";
		String result=UtilityLogics.stowatch(StartTime, EndTime);
		System.out.println(result);
	}
}