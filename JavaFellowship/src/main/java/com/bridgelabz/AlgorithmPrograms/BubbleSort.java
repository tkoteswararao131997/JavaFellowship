package com.bridgelabz.AlgorithmPrograms;
import java.util.*;

import com.bridgelabz.utility.UtilityLogics;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int nums[]= {12,32,1,6,19,8,76,14,72};
		nums=UtilityLogics.bubbleSort(nums);
		UtilityLogics.iterateArray(nums);
	}
}