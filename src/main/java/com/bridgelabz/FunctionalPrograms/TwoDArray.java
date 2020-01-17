package com.bridgelabz.FunctionalPrograms;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgelabz.utility.UtilityLogics;
import com.bridgelabz.utility.UtilityScanner;

public class TwoDArray 
{
	public static void main(String[] args) throws IOException 
	{
		int rows=UtilityScanner.readInteger();
		int cols=UtilityScanner.readInteger();
		int result[][]=UtilityLogics.array2D(rows, cols);
		PrintWriter pw=new PrintWriter(System.out);
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				pw.print(result[i][j]);
			}
			System.out.println();
		}
	}
}