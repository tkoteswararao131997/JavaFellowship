package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PermutationRecursion 
{
	public static void main(String[] args) 
	{
		String word=UtilityScanner.readString();
		UtilityLogics.recursionWords(word,0,word.length()-1);
	}
}