package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityStack;

public class StackExpression
{
	public static void main(String[] args) 
	{
		String exp="(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)"; 
		UtilityStack s=new UtilityStack();
		char ch[]=exp.toCharArray();
		int i=0;
		for (i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='(')
				s.push(ch[i]);
			if(ch[i]==')')
				s.pop();
		}
		boolean b=s.isEmpty();
		if(b==true && i==ch.length)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	
	}
}
