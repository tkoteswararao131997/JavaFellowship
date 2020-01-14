package com.bridgelabz.DataStructures;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.UtilityLinkedList;
import com.bridgelabz.utility.UtilityScanner;

public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		UtilityLinkedList l=new UtilityLinkedList();
		Scanner file=new Scanner(new File("/home/user/Desktop/orderedfile.txt"));
		while(file.hasNext())
		{
			String s=file.next();
			int num=l.size(l);
			l.insertAt(s,l,num);
		}
		String input=UtilityScanner.readString();
		int index=l.search(l,input);
		System.out.println(index);
		int len=l.size(l);
		//System.out.println(index);
		if(index==-1)
			l.insertAt(input,l,len);
		else
			l.delete(index);
		l.display(l);
		//System.out.println(len);
		FileWriter fw=new FileWriter("/home/user/Desktop/wordsout.txt");
		BufferedWriter br=new BufferedWriter(fw);
		for (int i = 0; i < len-1; i++) 
		{
			br.write(l.get(l,i));
			System.out.print(" ");
		}
		br.close();
		
	}
}
