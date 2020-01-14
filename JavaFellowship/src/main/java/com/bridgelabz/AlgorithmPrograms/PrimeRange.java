package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PrimeRange 
{
	public static void main(String[] args) 
	{
		int n=UtilityScanner.readInteger();
		int primes[]=UtilityLogics.primerange(n);
		UtilityLogics.display(primes);
	}
}