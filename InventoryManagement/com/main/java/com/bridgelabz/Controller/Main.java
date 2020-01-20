package com.bridgelabz.Controller;

import com.bridgelabz.Service.InventoryImplementation;
import com.bridgelabz.utility.UtilityScanner;

public class Main 
{
	public static void main(String[] args) 
	{
		InventoryImplementation imp=new InventoryImplementation();
		boolean traverse=true;
		while(traverse==true)
		{
			System.out.println("1.Add inventory 2.show inventory 3.calculate inventory\n"
					+ "4.remove inventory 5.total weight 6.total price 7.exit");
			System.out.println("enter choice");
			int choice=UtilityScanner.readInteger();
			switch(choice)
			{
			case 1:imp.addinventory();
					break;
			case 2:imp.showinventory();
					break;
			case 3:imp.calculateinventory();
					break;
			case 4:imp.removeinventory();
					break;
			case 5:imp.totalweight();
					break;
			case 6:imp.totalprice();
					break;
			case 7:	traverse=false;
					break;
			default:System.out.println("enter correct choice");
					break;
			}
		}
	}
}
