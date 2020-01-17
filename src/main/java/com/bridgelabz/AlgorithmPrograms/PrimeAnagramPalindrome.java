package com.bridgelabz.AlgorithmPrograms;

import java.util.ArrayList;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class PrimeAnagramPalindrome 
{
	public static void main(String[] args) 
	{
		int n=UtilityScanner.readInteger();
		ArrayList l=UtilityLogics.primeanapali(n);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
			System.out.println(l.get(++i));
		}
		
	}
}
