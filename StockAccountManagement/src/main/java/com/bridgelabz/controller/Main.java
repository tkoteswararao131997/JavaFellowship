package com.bridgelabz.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.repository.LinkedList;
import com.bridgelabz.repository.UtilityScanner;
import com.bridgelabz.service.StockImplentation;
import com.bridgelabz.service.StockInterface;

public class Main 
{
	public static void main(String[] args)
	{
		StockImplentation s=new StockImplentation();
	
		boolean traverse=true;
		System.out.println("1.view particular company value 2.value of total companies 3.buy company share\n"
				+ "4.sell company share 5.add company 6.delete companny\n 7.print report 8.exit");
		while(traverse==true)
		{
			System.out.println("enter choice:");
			int choice=UtilityScanner.readInteger();
		switch(choice)
		{
		case 1:System.out.println("enter company name ");
			String particularstock=UtilityScanner.readString();
			double singleval=s.eachstockval(particularstock);
			System.out.println("share value of "+particularstock+" in $:"+singleval/70);
			break;
		case 2:double totalval=s.allstockval();
				System.out.println("value of total companies in $:"+totalval/70);
				break;
		case 3:System.out.println("enter company name to buy shares");
				String symbols=UtilityScanner.readString();
				System.out.println("enter no.of shares u want to buy");
				int amount=UtilityScanner.readInteger();
				s.buy(amount, symbols);
				break;
		case 4:System.out.println("enter companyname to sell shares");
				String symbol=UtilityScanner.readString();
				System.out.println("enter how many shares u want to sell");
				int sells=UtilityScanner.readInteger();
				s.sell(sells, symbol);
				break;
		case 5:s.addcompany();
				System.out.println("successfully added");
				break;
		case 6:System.out.println("enter company name to delete");	
				s.deletecompany(UtilityScanner.readString());
				break;
		case 7:s.printreport();
				break;
		case 8:System.out.println("gud buy");
				traverse=false;
				break;
		default :System.out.println("enter correct choice");
					break;
		}
	}
}
}
