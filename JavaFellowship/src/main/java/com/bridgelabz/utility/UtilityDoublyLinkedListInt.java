package com.bridgelabz.utility;

public class UtilityDoublyLinkedListInt 
{
	UtilityDoublyLinkedListInt head;
	UtilityDoublyLinkedListInt next;
	UtilityDoublyLinkedListInt prev;
	UtilityDoublyLinkedListInt tail;
	int data;
	public void addFirst(int data)
	{
		UtilityDoublyLinkedListInt node=new UtilityDoublyLinkedListInt();
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
	public void addLast(int data)
	{
		UtilityDoublyLinkedListInt node=new UtilityDoublyLinkedListInt();
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
	public void deleteLast()
	{
		
	}
	public void displayforward()
	{
		UtilityDoublyLinkedListInt n=head;
		while(n!=null)
		{
			System.out.println(n.prev+" "+n.data+" "+n.next+" "+n);
			//System.out.println(n.data);
			n=n.next;
		}
	}
	public void displaybackward()
	{
		UtilityDoublyLinkedListInt n=tail;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.prev;
		}
	}
	
//	public static void main(String[] args)
//	{
//		UtilityDoublyLinkedListInt l=new UtilityDoublyLinkedListInt();
//		l.addFirst(20);
//		l.addFirst(10);
//		l.addFirst(2);
//		l.addFirst(9);
//		l.displayforward();
//		System.out.println("......................");
//		l.deletelast();
//		l.displayforward();
//	}
}
