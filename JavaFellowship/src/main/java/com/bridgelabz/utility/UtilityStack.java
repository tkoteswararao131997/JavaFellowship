package com.bridgelabz.utility;

public class UtilityStack 
{
	char pu[]=new char[20];
	int top=0;
	public void push(char ch) 
	{
		pu[top]=ch;
		top++;
	}
	public void display(char[] s) 
	{
		for(char i : s)
		{
			System.out.print(i+" ");
		}
	}
	public void pop()
	{
		top--;
		pu[top]='0';
	}
	public boolean isEmpty()
	{
		for(int i=0;i<pu.length;i++)
		{
			if(pu[i]=='(')
				return false;
		}
		return true;
	}
	
		
}