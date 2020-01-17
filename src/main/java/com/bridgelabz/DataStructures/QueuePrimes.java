package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class QueuePrimes 
{
	public class LinkedListint
	{
		LinkedListint next;
		int data;
	}
	LinkedListint head;
	public void enqueue(int data)
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
	public static void main(String[] args) 
	{
		QueuePrimes q=new QueuePrimes();
		int range =UtilityScanner.readInteger();
		int primes[]=UtilityLogics.primerange(range);
		int result[]=new int[primes.length];
		int rows=10,cols=25,inc=100;
		int anagramprimes[][]=new int[rows][cols];
		int count=0;
		Object check[]=UtilityLogics.anagramsrange(anagramprimes,primes,result,count);
		for (int i = 0; i < check.length; i++) 
		{
			q.enqueue((int)check[i]);
		}
		q.show();
	}
}
