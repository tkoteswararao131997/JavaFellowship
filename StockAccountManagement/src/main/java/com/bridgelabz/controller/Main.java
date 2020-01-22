package com.bridgelabz.controller;

import com.bridgelabz.repository.UtilityScanner;
import com.bridgelabz.service.StockImplentation;
import com.bridgelabz.service.StockInterface;

public class Main 
{
	public static void main(String[] args)
	{
		StockImplentation s=new StockImplentation();
	
		boolean traverse=true;
		while(traverse==true)
		{
			System.out.println("1.view particular stock value\n2.value of total stocks\n3.exit");
			System.out.println("enter choice:");
			int choice=UtilityScanner.readInteger();
		switch(choice)
		{
		case 1:System.out.println("enter stock name ");
			String particularstock=UtilityScanner.readString();
			double singleval=s.eachstockval(particularstock);
			System.out.println("stock value of "+particularstock+" is:"+singleval);
			break;
		case 2:double totalval=s.allstockval();
				System.out.println("value of total stocks:"+totalval);
				break;
		case 3:System.out.println("gud bye");
				traverse=false;
		
		}
		}
	}
}
