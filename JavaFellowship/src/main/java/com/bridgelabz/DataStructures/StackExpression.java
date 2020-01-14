package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityStack;

public class StackExpression
{
	public static void main(String[] args) 
	{
		String exp="(5+6)*(7+8)/()4+3)(5+6)*(7+8)/(4+3)"; 
		UtilityStack s=new UtilityStack();
		char ch[]=exp.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(')
				s.push(ch[i]);
			if(ch[i]==')')
				s.pop();
		}
		boolean b=s.isEmpty();
		System.out.println(b);
	}
}
