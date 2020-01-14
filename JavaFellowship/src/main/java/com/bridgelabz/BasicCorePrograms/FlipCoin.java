package com.bridgelabz.BasicCorePrograms;

import com.bridgelabz.utility.*;

public class FlipCoin 
{
	public static void main(String[] args)
	{
		int flips=UtilityScanner.readInteger();
		double percentage=UtilityLogics.flipcoinper(flips);
		System.out.println(percentage);
	}
}

