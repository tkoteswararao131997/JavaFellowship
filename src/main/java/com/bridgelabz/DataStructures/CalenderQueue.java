package com.bridgelabz.DataStructures;

public class CalenderQueue 
{
	public class LinkedListChar
	{
		LinkedListChar next;
		char data;
	}
	LinkedListChar head;
	public void enqueue(char data)
	{
		LinkedListChar node=new LinkedListChar();
		node.data=data;
		if(head==null)
			head=node;
		else
		{
			LinkedListChar n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void showchar()
	{
		LinkedListChar n=head;
		while(n!=null)
		{
			System.out.print(n.data+"  ");
			n=n.next;
		}
	}
	public static void main(String[] args) 
	{
		CalenderQueue q=new CalenderQueue();
		char ch[]= {'s','m','t','w','t','f','s'};
		for (int i = 0; i < ch.length; i++) 
		{
			q.enqueue(ch[i]);
		}
		q.showchar();
		for(int i=1;i<32;i++)
		{
			q.enqueue(data);
		}
	}
}
