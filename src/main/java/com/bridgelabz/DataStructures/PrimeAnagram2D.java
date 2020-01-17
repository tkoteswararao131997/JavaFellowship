package com.bridgelabz.DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PrimeAnagram2D 
{
	public static void main(String[] args)
	{
		int range =UtilityScanner.readInteger();
		int primes[]=UtilityLogics.primerange(range);
		int result[]=new int[primes.length];
		int rows=10,cols=25,inc=100;
		int anagramprimes[][]=new int[rows][cols];
		int count=0;
		
		for (int i = 0; i < primes.length; i++) 
		{
			for (int j = i+1; j < primes.length; j++) 
			{
				boolean b=UtilityLogics.isAnagramInt(primes[i], primes[j]);
				if(b==true)
				{
					result[count]=primes[i];
					++count;
					result[count]=primes[j];
					++count;
				}
			}
		}
		TreeSet s=new TreeSet();
	   for (int i = 0; i < count; i++) 
	   {
		s.add(result[i]);
	   }
	   Object check[]=s.toArray();
	   int c=0;
	   for (int i = 0; i < anagramprimes.length; i++) 
	   {
		for (int j = 0; j < anagramprimes.length; j++) 
		{
			if((int)check[c]<inc)
			{
				anagramprimes[i][j]=(int)check[c];
				c++;
				if(anagramprimes[i][j]!=0)
				System.out.print(anagramprimes[i][j]+" ");
			}
		}  
		System.out.println();
		inc=inc+100;
	   }
	}
		
}
