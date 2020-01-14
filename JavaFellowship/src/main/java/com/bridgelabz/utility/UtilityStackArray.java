package com.bridgelabz.utility;
public class UtilityStackArray 
{
	char a[]=new char[10];
	int top=0;
	public void push(char ch)
	{
		if(top==a.length)
		{
			System.out.println("stack is full");
		}
		else
		{
		a[top]=ch;
		top++;
		}
	}
	public void pop()
	{
		if(isEmpty()==true)
		{
			System.out.println("stack is empty");
			top--;
		}
		else
		{
		top--;
		a[top]=' ';
		}
	}
	public char peek()
	{
		return a[top-1];
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	public int size()
	{
		return top;
	}
	
	public void show() 
	{
		for(char ch : a)
		{
			System.out.print(ch+" ");
		}
	}
}