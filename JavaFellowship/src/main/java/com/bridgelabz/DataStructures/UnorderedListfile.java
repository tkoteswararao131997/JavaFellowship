package com.bridgelabz.DataStructures;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;
import java.util.Scanner;
import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class UnorderedListfile 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(new File("/home/user/Desktop/words.txt"));
		FileReader fr=new FileReader("/home/user/Desktop/words.txt");
		BufferedReader br=new BufferedReader(fr);
		LinkedList<String> l=new LinkedList<String>();
		while(sc.hasNext())
		{
			String word=sc.next().trim();
			l.add(word);
		}
		Collections.sort(l);
		String input=UtilityScanner.readString();
		boolean b=false;
		for (int i = 0; i < l.size(); i++) 
		{
			if(l.get(i).equals(input))
			{
				l.remove(i);
				b=true;
			}
		}
		if(b==false)
		{
			l.add(input);
		}
		FileWriter file=new FileWriter("/home/user/Desktop/wordsout.txt");
		for(String  str : l)
		{
			file.write(str);
		}
		file.close();
	}
}
