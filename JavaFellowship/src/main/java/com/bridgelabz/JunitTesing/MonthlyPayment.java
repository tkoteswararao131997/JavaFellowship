package com.bridgelabz.JunitTesing;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		double P=UtilityScanner.readDouble();
		double Y=UtilityScanner.readDouble();
		double R=UtilityScanner.readDouble();
		double result=UtilityLogics.monthlypayment(P,Y,R);
		System.out.println(result);
	}
}
