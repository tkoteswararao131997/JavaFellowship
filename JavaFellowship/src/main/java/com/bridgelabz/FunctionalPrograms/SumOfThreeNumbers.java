package com.bridgelabz.FunctionalPrograms;

import java.util.ArrayList;

import com.bridgelabz.utility.*;

public class SumOfThreeNumbers
{
	public static void main(String[] args) 
	{
		int a[]=UtilityLogics.randomArray();
		ArrayList<Integer> l=UtilityLogics.sumOfThree(a);
		for (int i = 0; i <l.size() ; i++) 
		{
			System.out.print(l.get(i)+" ");
			System.out.print(l.get(++i)+" ");
			System.out.print(l.get(++i)+" ");
			System.out.println();
		}
	}
}