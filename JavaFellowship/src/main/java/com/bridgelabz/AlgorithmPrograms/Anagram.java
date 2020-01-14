package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1=UtilityScanner.readString();
		String s2=UtilityScanner.readString();
		boolean b=UtilityLogics.isAnagram(s1,s2);
		System.out.println(b);
	}
}