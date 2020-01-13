package com.bridgelabz.utility;
public class UtilityLinkedList 
{
	UtilityLinkedList head;
	UtilityLinkedList next;
	String data;
	public  UtilityLinkedList insert(String s)
	{
		UtilityLinkedList node=new UtilityLinkedList();
		node.data=s;
		if(head==null)
			head=node;
		else
		{
			UtilityLinkedList n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		return node;
	}
	public void display(UtilityLinkedList node)
	{
		UtilityLinkedList n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public int search(UtilityLinkedList l,String word) 
	{
		int index=0;
		UtilityLinkedList n=head;
		while(n!=null)
		{
			if(n.data.equals(word))
				return index;
			n=n.next;
			index++;
		}
		return -1;
	}
	public UtilityLinkedList delete(int index) 
	{
		UtilityLinkedList n=new UtilityLinkedList();
		if(index==0)
			head=head.next;
		else
		{
			n=head;
			UtilityLinkedList n1=null;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			
		}
		return n;	
	}
	public int size(UtilityLinkedList l)
	{
		UtilityLinkedList n=head;
		int count=0;
		while(n!=null)
		{
			n=n.next;
			count++;
		}
		
		return count++;
		
		
	}
	public String get(UtilityLinkedList l, int i)
	{
		UtilityLinkedList n=head;
		int num=0;
		while(num!=i)
		{
			n=n.next;
			num++;
		}
		String s=n.data;
		return s+" ";
	}
}
