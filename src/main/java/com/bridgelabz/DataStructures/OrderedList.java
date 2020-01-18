package com.bridgelabz.DataStructures;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.UtilityLinkedListString;
import com.bridgelabz.utility.UtilityScanner;

public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		LinkedList<String> l=new LinkedList<String>();
		Scanner file=new Scanner(new File("/home/user/Desktop/orderedfile.txt"));
		while(file.hasNext())
		{
			String s=file.next();
			l.insertAt(s);
		}
		String input=UtilityScanner.readString();
		boolean b=l.search(input);
		if(b==false)
		{
			l.insertAt(input);
		}
		else
		{
			int index=l.index(input);
			System.out.println(index);
			l.pop(index);
		}
		int len=l.size();
		FileWriter fw=new FileWriter("/home/user/Desktop/orderedfile.txt");
		BufferedWriter br=new BufferedWriter(fw);
		for (int i = 0; i <len; i++) 
		{
			br.write(" "+l.pop(0));
		}
		br.close();
		
	}
}
