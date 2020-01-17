package com.bridgelabz.DataStructures;
import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class StackPrimes 
{
	public class LinkedListint
	{
		LinkedListint next;
		LinkedListint prev;
		int data;
	}
	LinkedListint head;
	public void push(int data)
	{
		LinkedListint node=new LinkedListint();
		node.data=data;
		if(head==null)
		head=node;
		else
		{
			LinkedListint n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show()
	{
		LinkedListint n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;	
		}
		
	}
	public int  pop()
	{
			int val;
			if(head.next==null)
			{
				val=head.data;
				head=null;
			}
			else
			{
			LinkedListint n=head;
			LinkedListint n1=null;
			while(n.next!=null)
			{
				n1=n;
				n=n.next;
			}
			val=n1.next.data;
			n1.next=null;
			}
			return val;
			
	}
	
	public static void main(String[] args) 
	{
		StackPrimes s=new StackPrimes();
		StackPrimes s2=new StackPrimes();
		int range =UtilityScanner.readInteger();
		int primes[]=UtilityLogics.primerange(range);
		int result[]=new int[primes.length];
		int rows=10,cols=25,inc=100;
		int anagramprimes[][]=new int[rows][cols];
		int count=0;
		Object check[]=UtilityLogics.anagramsrange(anagramprimes,primes,result,count);
		for (int i = 0; i < check.length; i++) 
		{
			s.push((int)check[i]);
		}
		for (int i = 0; i < check.length; i++) 
		{
			int val=s.pop();
			s2.push(val);
		}
		s2.show();
		
		
	}
}
