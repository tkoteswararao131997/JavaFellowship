package com.bridgelabz.utility;

public class UtilityDequeue
{
	UtilityDoublyLinkedListChar l=new UtilityDoublyLinkedListChar();
	int range=50,front=0,rear=0,capacity=0;
	public void addFront(char data)
	{
		if(capacity<range)
		{
		l.addFirst(data);
		rear=(rear+1)%range;
		capacity++;
		}
		else
			System.out.println("queue overflow");
	}
	public void addrear(char data)
	{
		if(size()<range)
		{
			l.addLast(data);
			rear=(rear+1)%range;
			capacity++;
		}
		else
			System.out.println("queue overflow");
	}
	public void removefront()
	{
		if(isEmpty()==false)
		{
			l.deletefirst();
			front=(front+1)%range;
			capacity--;
		}
		else
			System.out.println("queue underflow");
	}
	public void removerear()
	{
		if(isEmpty()==false)
		{
			l.deletelast();
			front=(front+1)%range;
			capacity--;
		}
		else
			System.out.println("queue underflow");
	}
	public char get(int i)
	{
		char ch=' ';
		ch=l.getLast(i);
		return ch;
	}
	public boolean isEmpty()
	{
		return capacity<=0;
	}
	
	public void show()
	{
		l.displayforward();
	}
	public int size()
	{
		return capacity;
	}
//	public static void main(String[] args)
//	{
//		UtilityDequeue d=new UtilityDequeue();
//		d.addFront('c');
//		d.addFront('h');
//		d.addFront('a');
//		d.addFront('n');
//		d.addrear('k');
//		d.addrear('e');
//		d.removerear();
//		d.removefront();
//		d.removerear();
//		d.show();
//		d.addFront('n');
//		d.addrear('k');
//		d.addrear('e');
//		
//		d.show();
//	}
}
