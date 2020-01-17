package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PermutationIteration 
{
	public static void main(String[] args)
	{
		String word=UtilityScanner.readString();
		String words[]=UtilityLogics.iterateWords(word);
	}
}