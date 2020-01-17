package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class BinaryNibbles 
{
public static void main(String[] args) 
{
	int num=UtilityScanner.readInteger();
	int result=UtilityLogics.binaryNibbles(num);
	System.out.println(result);
}
}
