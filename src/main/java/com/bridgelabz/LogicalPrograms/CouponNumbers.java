package com.bridgelabz.LogicalPrograms;

import com.bridgelabz.utility.*;
public class CouponNumbers 
{
	public static void main(String[] args) 
	{
		int N=UtilityScanner.readInteger();
		int count=UtilityLogics.randomCoupons(N);
		System.out.println(count);
	}
}