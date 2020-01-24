package com.bridgelabz.controller;

import com.bridgelabz.repository.UtilityScanner;
import com.bridgelabz.service.AddressBookmethodsImplementation;

public class AddressBookMain 
{
	public static void main(String[] args) 
	{
		AddressBookmethodsImplementation a=new AddressBookmethodsImplementation();
		boolean b=true;
		while(b==true)
		{
			System.out.println("1.Add person 2.Edit person 3.Delete person 4.sort by last names\n"
					+ "5.sort by zipcodes 6.print all persons 7.exit");
			System.out.println("enter choice:");
			int choice=UtilityScanner.readInteger();
			switch(choice)
			{
			case 1:a.addperson();
					System.out.println("successfully added");
					break;
			case 2:System.out.println("enter person name for edit");
					String edit=UtilityScanner.readString();
					a.editperson(edit);
					System.out.println("successfully edited");
					break;
			case 3:System.out.println("enter person for delete");
					String delete=UtilityScanner.readString();
					a.deleteperson(delete);
					System.out.println("successfully deleted");
					break;
			case 4:a.sortlastnames();
					System.out.println("successfully sorted");
					break;
			}
		}
	}
}
