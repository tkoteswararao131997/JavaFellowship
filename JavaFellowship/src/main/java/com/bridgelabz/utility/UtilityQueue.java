package com.bridgelabz.utility;

public class UtilityQueue 
{
	UtilityLinkedListString l=new UtilityLinkedListString();
	int range=3;
	int front=0,rear=0;
	public void enqueue(String item)
	{
		if(rear<range)
		{
		rear=(rear+1)%range;
		l.insert(item);
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
		}
		else
			System.out.println("queue underflow");
	}
	public void show()
	{
		l.display(l);
		System.out.println("-------------------");
	}
	public static void main(String[] args) {
		UtilityQueue q=new UtilityQueue();
		UtilityLinkedListString l=new UtilityLinkedListString();
		q.enqueue("Koti");
		q.enqueue("firoz");
		q.enqueue("hima");
		q.enqueue("hello");
		q.enqueue("hey");
		q.dequeue();
		q.show();
		
		
	}
}
