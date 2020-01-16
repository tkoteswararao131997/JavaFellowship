package com.bridgelabz.utility;

public class UtilityStackLinkedList 
{
	int top=0;
	int range=15;
	UtilityLinkedListChar l=new UtilityLinkedListChar();
	public void push(char ch)
	{
		if(top<range)
		{
			l.insert(ch);
			top++;
		}
	}
	public void show()
	{
		l.show();
	}
	public void pop()
	{
		top--;
		if(top>=0)
		{
			l.delete();
		}
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	public int size()
	{
		return top;
	}
}
