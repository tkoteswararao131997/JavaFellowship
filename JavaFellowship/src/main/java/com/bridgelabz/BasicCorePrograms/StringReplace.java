package com.bridgelabz.BasicCorePrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class StringReplace 
{
	public static void main(String[] args) 
	{
		String str=UtilityScanner.readString();
		str=UtilityLogics.replaceString(str);
		System.out.println(str);
	}
}