package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLinkedListString;
import com.bridgelabz.utility.UtilityQueue;
import com.bridgelabz.utility.UtilityScanner;

public class BankingCashCounter 
{
	public static void main(String[] args) 
	{
		long balance=50000;
		UtilityQueue q=new UtilityQueue();
		System.out.println("enter no.of users");
		int users=UtilityScanner.readInteger();
		String s="";
		int ch,withdrawamount,depositamount;
		for (int i = 0; i < users; i++)
		{
			s=UtilityScanner.readString();
			q.enqueue(s);
			System.out.println("1.withdraw 2.deposit"); 
			ch=UtilityScanner.readInteger();
			switch(ch)
			{
			case 1:System.out.println("enter withdraw amount");
					withdrawamount=UtilityScanner.readInteger();
					balance=balance-withdrawamount;
					q.dequeue();
					break;
				
			case 2:System.out.println("enter deposit amount");
					depositamount=UtilityScanner.readInteger();
					balance=balance+depositamount;
					q.dequeue();
					break;
			default:System.out.println("enter correct option");
			
			}
		}
		System.out.println("Balance:"+balance);
	}
}