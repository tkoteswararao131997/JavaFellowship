package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PrimeRange2D 
{
	public static void main(String[] args) 
	{
		int range=UtilityScanner.readInteger();
		int primes[]=UtilityLogics.primerange(range);
		int rows=10,cols=25;
		int primes2D[][]=new int[rows][cols];
		int count=0,inc=100;
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
//				System.out.println(i+" "+j);
				if(count<primes.length)
				{
				if(primes[count]<=inc)
				{
				primes2D[i][j]=primes[count];
				count++;
				}
				}
				if(primes2D[i][j]!=0)
				System.out.print(primes2D[i][j]+" ");
			}
			inc=inc+100;
			System.out.println();
		}
	}
}
