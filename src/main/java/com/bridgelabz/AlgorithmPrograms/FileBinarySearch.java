package com.bridgelabz.AlgorithmPrograms;
import java.io.File;
import java.io.IOException;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;
/**
 * author KOTI
 * version 1.0
 * search a word present or not
 */
import java.util.*;
public class FileBinarySearch
{
	public static void main(String[] args) throws IOException 
	{
		Scanner inFile1= new Scanner(new File("C:\\Users\\PREM\\Desktop\\filebinarysearch.txt"));
		ArrayList<String> s=new ArrayList<String>();
		int count=0;
		String input=UtilityScanner.readString();
	    while (inFile1.hasNext()) 
	    {
	      String word = inFile1.next().trim();
	      s.add(word);
	    }
	    Collections.sort(s);
	    String words[]=new String[s.size()];
	    for(int i=0;i<words.length;i++)
	    {
	    	words[i]=s.get(i);
	    	System.out.println(words[i]+" "+i);
	    }
	   boolean b=UtilityLogics.fileBinarySearch(words,input,0,words.length-1);
	   System.out.println(b);
	}
}