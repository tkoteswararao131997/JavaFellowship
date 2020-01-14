package com.bridgelabz.BasicCorePrograms;

import java.util.ArrayList;

import com.bridgelabz.utility.*;
public class PrimeFactorization 
{
	public static void main(String[] args) 
	{
		int n=UtilityScanner.readInteger();
		ArrayList result=UtilityLogics.primefactorization(n);
		for (int i = 0; i < result.size(); i++)
		{
			System.out.print(result.get(i)+" ");
		}
	}
}