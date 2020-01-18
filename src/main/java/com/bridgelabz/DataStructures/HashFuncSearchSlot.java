package com.bridgelabz.DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utility.HashMap;
import com.bridgelabz.utility.LinkedList;

public class HashFuncSearchSlot 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file=new Scanner(new File("/home/user/Desktop/NumSlot"));
		HashMap<Integer> h=new HashMap<Integer>();
		int data;
		while(file.hasNext())
		{
			data=file.nextInt();
			h.add(data);
		}
		h.show();
	}
}
