package com.bridgelabz.controller;

import com.bridgelabz.repository.UtilityScanner;
import com.bridgelabz.service.CliniqueMethodsImplementation;

public class CliniqueMain
{
	public static void main(String[] args) 
	{
		CliniqueMethodsImplementation c=new CliniqueMethodsImplementation();
		boolean b=true;
		while(b==true)
		{
			System.out.println("1.Add Doctor 2.Add Patient 3.Search Doctor 4.Search Patient 5.take appointment 6.Exit");
			int ch=UtilityScanner.readInteger();
			switch(ch)
			{
			case 1:c.addDoctor();
						break;
			case 2:c.addPatient();
						break;
			case 3:System.out.println("enter doctor name or id or avaliability or specilization");
					String anything=UtilityScanner.readString();
					c.searchDoctor(anything);
						break;
			case 4:System.out.println("enter patient name or id or mobilenumber or age");
					anything=UtilityScanner.readString();
					c.searchPatient(anything);
						break;
			case 5:System.out.println("enter doctor name or id for taking appointment");
					anything=UtilityScanner.readString();
					System.out.println("enter ur name");
					String patient=UtilityScanner.readString();
					c.appointment(anything,patient);
					break;
			case 6:b=false;
					System.out.println("gud bye");
					break;
			default:System.out.println("enter valid option");
					break;
			}
		}
	}
}
