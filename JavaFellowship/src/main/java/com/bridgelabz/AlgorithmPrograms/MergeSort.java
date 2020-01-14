package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.UtilityLogics;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		String nums[]= {"hello","hi","how","are","you","happy","to","see","you","ag","a"};
		UtilityLogics.divide(nums,0,nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}