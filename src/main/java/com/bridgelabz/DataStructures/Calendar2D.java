package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class Calendar2D 
{
	public static void main(String[] args) 
	{
		int month=UtilityScanner.readInteger();
		int year=UtilityScanner.readInteger();
		switch(month)
		{
		case 1:System.out.println("jan "+year);
		break;
		case 2:System.out.println("feb "+year);
		break;
		case 3:System.out.println("mar "+year);
		break;
		case 4:System.out.println("apr "+year);
		break;
		case 5:System.out.println("may "+year);
		break;
		case 6:System.out.println("jun "+year);
		break;
		case 7:System.out.println("jul "+year);
		break;
		case 8:System.out.println("aug "+year);
		break;
		case 9:System.out.println("sep "+year);
		break;
		case 10:System.out.println("oct "+year);
		break;
		case 11:System.out.println("nov "+year);
		break;
		case 12:System.out.println("dec "+year);
		break;
		default:System.out.println("enter valid month");
				break;
		}
		System.out.println("s  m  t  w  t  f  s");
		UtilityLogics.calender(month, year);
		
	}
}
