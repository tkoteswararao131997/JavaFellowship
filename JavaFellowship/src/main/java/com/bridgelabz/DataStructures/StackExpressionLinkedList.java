package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLinkedList;
import com.bridgelabz.utility.UtilityStackLinkedList;

public class StackExpressionLinkedList
{
	public static void main(String[] args) 
	{
		String exp="(5+6)∗(7+8) /(((4+3))(5+6)∗(7+8)/(4+3)";
		UtilityLinkedList l=new UtilityLinkedList();
		UtilityStackLinkedList s=new UtilityStackLinkedList();
		int i=0;
		for(i=0;i<exp.length();i++)
		{
			l.insertchar(exp.charAt(i));
			if(l.getchar(l, i)=='(')
				s.push(exp.charAt(i));
			if(l.getchar(l, i)==')')
				s.pop();
			s.show();
			if(s.size()==-1)
				break;
		}
		
	}
}
