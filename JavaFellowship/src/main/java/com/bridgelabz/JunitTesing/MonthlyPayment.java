package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		double p=UtilityScanner.readDouble();
		double y=UtilityScanner.readDouble();
		double r=UtilityScanner.readDouble();
		double result=UtilityLogics.monthlypayment(p,y,r);
		System.out.println(result);
	}
}
