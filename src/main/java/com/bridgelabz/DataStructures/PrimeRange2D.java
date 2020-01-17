package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PrimeRange2D 
{
	public static void main(String[] args) 
	{
		int range=UtilityScanner.readInteger();
		int primes2D[][]=UtilityLogics.PrimeRange2D(range);
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 25; j++) 
			{
				if(primes2D[i][j]!=0)
				{
					System.out.print(primes2D[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
