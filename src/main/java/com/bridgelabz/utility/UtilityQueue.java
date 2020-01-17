package com.bridgelabz.utility;

public class UtilityQueue 
{
	UtilityLinkedListString l=new UtilityLinkedListString();
	int range=3;
	int front=0,rear=0,capacity=0;
	public void enqueue(String item)
	{
		if(rear<range)
		{
		rear=(rear+1)%range;
		l.insert(item);
		capacity++;
		}
		else
			System.out.println("queue overflow");
	}
	public void dequeue()
	{
		if(front<range)
		{
		l.delete();
		front=(front+1)%range;
		capacity--;
		}
		else
			System.out.println("queue underflow");
	}
	public boolean isEmpty()
	{
		return capacity<=0;
	}
	public int size()
	{
		return capacity;
	}
	public void show()
	{
		l.display(l);
		System.out.println("-------------------");
	}
}
