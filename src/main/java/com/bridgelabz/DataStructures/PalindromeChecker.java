package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Dequeue;
import com.bridgelabz.utility.UtilityDequeue;
import com.bridgelabz.utility.UtilityScanner;

public class PalindromeChecker
{
	public static void main(String[] args) 
	{
		Dequeue<Character> d=new Dequeue<Character>();
		String input=UtilityScanner.readString();
		for(int i=0;i<input.length();i++)
		{
			d.addRear(input.charAt(i));
		}
		String s="";
		char ch=' ';
		for(int i=0;i<input.length();i++)
		{
			ch=d.removeRear();
			s=s+ch;
		}
		if(input.equals(s))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
