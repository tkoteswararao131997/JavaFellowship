package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class VendingMachine 
{
	public static void main(String[] args)
	{
		int notes[]= {1,2,5,10,50,100,500,2000};
		long amount=UtilityScanner.readInteger();
		long numnotes=UtilityLogics.vendingmachine(notes,amount);
		System.out.println(numnotes);
	}
}
