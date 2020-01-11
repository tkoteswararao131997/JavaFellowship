package com.bridgelabz.AlgorithPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class GuessNumber
{
	public static void main(String[] args) 
	{
		int n=UtilityScanner.readInteger();
		int result=UtilityLogics.guessNumber(n);
		System.out.println(result);
	}
}
