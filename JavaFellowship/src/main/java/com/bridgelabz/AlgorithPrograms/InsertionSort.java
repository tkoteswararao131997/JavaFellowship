package com.bridgelabz.AlgorithPrograms;

import com.bridgelabz.utility.UtilityLogics;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
		arr=UtilityLogics.insertionsort(arr);
		UtilityLogics.display(arr);
	}
}