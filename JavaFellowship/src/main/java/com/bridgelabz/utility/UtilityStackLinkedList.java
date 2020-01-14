package com.bridgelabz.utility;

public class UtilityStackLinkedList 
{
	UtilityLinkedList l=new UtilityLinkedList();
	int top=0;
	public void push(char c)
	{
		l.insertchar(c);
	}
	public void pop()
	{
		l.deletechar();
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void show() 
	{
		for (int i = 0; i < l.size(l); i++) 
		{
			System.out.println(l.get(l, i));
		}
	}
}
