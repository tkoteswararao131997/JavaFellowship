package com.bridgelabz.DataStructures;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.UtilityLinkedListString;
import com.bridgelabz.utility.UtilityScanner;

public class test
{
	public static void main(String[] args) throws IOException 
	{
		UtilityLinkedListString l=new UtilityLinkedListString();
		Scanner file=new Scanner(new File("/home/user/Desktop/int.txt"));
		while(file.hasNext())
		{
			int n=file.nextInt();
			System.out.println(n);
		}
		
	}
}
