package com.bridgelabz.utility;

public class UtilityDoublyLinkedListChar 
{
	UtilityDoublyLinkedListChar head;
	UtilityDoublyLinkedListChar next;
	UtilityDoublyLinkedListChar prev;
	UtilityDoublyLinkedListChar tail;
	char data;
	public void addFirst(char data)
	{
		UtilityDoublyLinkedListChar node=new UtilityDoublyLinkedListChar();
		node.data=data;
		if(tail==null)
		{
			tail=node;
		}
		else
		{
			head.prev=node;
		}
		node.next=head;
		head=node;
	}
	public void addLast(char data)
	{
		UtilityDoublyLinkedListChar node=new UtilityDoublyLinkedListChar();
		node.data=data;
		if(head==null)
			head=node;
		else
		{
			tail.next=node;
		}
		node.prev=tail;
		tail=node;
	}
	public void deletefirst()
	{
		head=head.next;
		head.prev=null;
	}
	public void deletelast()
	{
		tail=tail.prev;
		tail.next=null;
	}
	public void displayforward()
	{
		UtilityDoublyLinkedListChar n=head;
		while(n!=null)
		{
			//System.out.println(n.prev+" "+n.data+" "+n.next+" "+n);
			System.out.println(n.data);
			n=n.next;
		}
	}
	public void displaybackward()
	{
		UtilityDoublyLinkedListChar n=tail;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.prev;
		}
	}
	public char getLast(int i)
	{
		char ch;
		if(i==0)
		{
			ch=tail.data;
		}
		else
		{
		UtilityDoublyLinkedListChar n=tail;
		for(int j=0;j<i;j++)
		{
			n=n.prev;
		}
		ch=n.data;
		}
		return ch;
	}
	public static void main(String[] args)
	{
	UtilityDoublyLinkedListChar l=new UtilityDoublyLinkedListChar();
		l.addFirst('a');
		l.addFirst('b');
		l.addFirst('c');
		l.addFirst('d');
		l.displayforward();
		System.out.println("......................");
		l.deletelast();
		l.deletelast();
		l.deletefirst();
		l.displayforward();
	}
}
	