package com.bridgelabz.DataStructures;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.UtilityLinkedListString;
import com.bridgelabz.utility.UtilityScanner;

public class UnorderedList 
{
	public static void main(String[] args) throws IOException 
	{
		UtilityLinkedListString l=new UtilityLinkedListString();
		Scanner file=new Scanner(new File("/home/user/Desktop/words.txt"));
		while(file.hasNext())
		{
			String s=file.next();
			l.insert(s);
		}
		String input=UtilityScanner.readString();
		int index=l.search(l,input);
		System.out.println(index);
		if(index==-1)
			l.insert(input);
		else
			l.delete(index);
		int len=l.size(l);
		System.out.println(len);
		FileWriter fw=new FileWriter("/home/user/Desktop/words.txt");
		BufferedWriter br=new BufferedWriter(fw);
		for (int i = 0; i < len; i++) 
		{
			br.write(l.get(l,i));
			System.out.print(" ");
		}
		br.close();
		
	}
}
