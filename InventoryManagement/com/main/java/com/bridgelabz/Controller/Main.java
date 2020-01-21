package com.bridgelabz.Controller;
import com.bridgelabz.Service.InventoryImplementation;
import com.bridgelabz.repository.*;

public class Main 
{
	public static void main(String[] args) 
	{
		InventoryImplementation imp=new InventoryImplementation();
		boolean traverse=true;
		while(traverse==true)
		{
			System.out.println("1.Add inventory 2.show inventory 3.calculate inventory\n"
					+ "4.remove inventory 5.total weight 6.total price  7.edit inventory 8.exit");
			System.out.println("enter choice");
			int choice=com.bridgelabz.repository.UtilityScanner.readInteger();
			switch(choice)
			{
			case 1:imp.addinventory();
					break;
			case 2:imp.showinventory();
					break;
			case 3:double d=imp.calculateinventory();
					System.out.println("inventory cost is:"+d);
					break;
			case 4:imp.removeinventory();
					break;
			case 5:double totalweight=imp.totalweight();
					System.out.println("total weight of all inventories in kg:"+totalweight);
					break;
			case 6:double totalprice=imp.totalprice();
					System.out.println("total price of all inventories in Rs:"+totalprice);
			case 7:imp.editinventory();
					break;
			case 8:	traverse=false;
					System.out.println("gud bye");
					break;
			default:System.out.println("enter correct choice");
					break;
			}
		}
	}
}
