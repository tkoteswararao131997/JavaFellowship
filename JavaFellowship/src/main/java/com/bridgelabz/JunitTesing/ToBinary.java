package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class ToBinary 
{
	public static void main(String[] args) 
	{
		int num=UtilityScanner.readInteger();
		String result=UtilityLogics.tobinary(num);
		System.out.println(result);
	}
}
