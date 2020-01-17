package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityDequeue;
import com.bridgelabz.utility.UtilityScanner;

public class PalindromeChecker
{
	public static void main(String[] args) 
	{
		UtilityDequeue d=new UtilityDequeue();
		String input=UtilityScanner.readString();
		for(int i=0;i<input.length();i++)
		{
			d.addrear(input.charAt(i));
		}
		String s="";
		char ch=' ';
		for(int i=0;i<input.length();i++)
		{
			ch=d.get(i);
			s=s+ch;
		}
		if(input.equals(s))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
