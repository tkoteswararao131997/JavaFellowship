package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.UtilitySearching;
/**
 * version 1.0
 * @author koti
 *
 */
public class AllSearchSort 
{
	public static void main(String[] args) 
	{
		int a[]= {12,54,1,3,98,70,16};
		char ch[]= {'r','u','p','k','o','c'};
		String str[]= {"hello","koti","how","are","you","anticipated","because","antipication"};
		int ele=3;
		char c='o';
		int index=UtilitySearching.binarysearchint(a,0,a.length-1,ele);
		System.out.println("using binarysearchint if element present:"+index);
		ele=20;
		index=UtilitySearching.binarysearchint(a,0,a.length-1,ele);
		System.out.println("using binarysearchint if element not present:"+index);	
		index=UtilitySearching.binarysearchchar(ch,0,a.length-1,c);
		System.out.println("using binarysearchchar if element  present:"+index);	
		c='a';
		System.out.println("using binarysearchchar if element not present:"+index);	
		System.out.println("--------------------------------------------------");
		ele=70;
		index=UtilitySearching.linearsearchint(a, ele);
		System.out.println("using linearsearch if element present:"+index);
		ele=7;
		index=UtilitySearching.linearsearchint(a, ele);
		System.out.println("using linearsearch if element not present:"+index);
		System.out.println("----------------------------------------------------");
		
		
	}
}
