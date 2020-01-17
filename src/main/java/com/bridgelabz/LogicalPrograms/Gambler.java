package com.bridgelabz.LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.*;
public class Gambler 
{
	public static void main(String[] args) 
	{
		int stake=UtilityScanner.readInteger();
		int goal=UtilityScanner.readInteger();
		HashMap<String,Object> result=UtilityLogics.gambler(stake, goal);
		for(HashMap.Entry<String, Object> entry : result.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}
}