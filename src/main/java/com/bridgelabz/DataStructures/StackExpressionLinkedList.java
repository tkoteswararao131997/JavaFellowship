package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.UtilityLinkedListString;
import com.bridgelabz.utility.UtilityStackLinkedList;

public class StackExpressionLinkedList
{
	public static void main(String[] args) 
	{
		String exp="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)()";
		Stack<Character> s=new Stack<Character>();
		char ch[]=exp.toCharArray();
		int i = 0;
		int open=0,close=0;
		for (i=0; i < ch.length; i++) 
		{
			if(ch[i]=='(')
			{
				open++;
			}
			else if(ch[i]==')')
			{
				close++;
			}
			if(close>open)
				break;
			if(ch[i]=='(')
				s.push(ch[i]);
			if(ch[i]==')')
				s.pop();
		}
		//System.out.println(open+" "+close);
		boolean b=s.isEmpty();
		if(b==true && i==ch.length)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
