package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLinkedList;
import com.bridgelabz.utility.UtilityStackArray;

public class StackExpression
{
	public static void main(String[] args) 
	{
		String exp="(5+6)∗(7+8) /(((4+3))(5+6)∗(7+8)/(4+3)"; 
		UtilityStackArray s=new UtilityStackArray();
		UtilityLinkedList l=new UtilityLinkedList();
		int i=0;
		for(i=0;i<exp.length();i++)
		{
			l.insertchar(exp.charAt(i));
			if(l.getchar(l, i)=='(')
				s.push(exp.charAt(i));
			if(l.getchar(l, i)==')')
				s.pop();
			if(s.size()==-1)
				break;
		}
		boolean b=s.isEmpty();
		if(b==true && i==exp.length())
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
