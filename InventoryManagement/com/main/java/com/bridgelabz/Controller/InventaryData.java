package com.bridgelabz.Controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.IMmethods;
import com.bridgelabz.utility.UtilityScanner;

public class InventaryData 
{
	private static void inventory()
	{
		
	}
	public static void main(String[] args) throws IOException, ParseException 
	{
		JSONArray ja=new JSONArray();
		JSONObject jo1=new JSONObject();
		jo1.put("name","Rice");
		jo1.put("weight", new Integer(5));
		jo1.put("price", new Integer(40));
		JSONObject inv1=new JSONObject();
		inv1.put("Inventory",jo1);
		JSONObject jo2=new JSONObject();
		jo2.put("name","wheat");
		jo2.put("weight", new Integer(90));
		jo2.put("price", new Integer(25));
		JSONObject inv2=new JSONObject();
		inv2.put("Inventory",jo2);
		JSONObject jo3=new JSONObject();
		jo3.put("name","Pulses");
		jo3.put("weight", new Integer(150));
		jo3.put("price", new Integer(70));
	

		ja.add(jo3);
		
		JSONObject first=new JSONObject();
		first.put("Inventory",ja);
		
		
		IMmethods im=new IMmethods();
		im.writetofile(first);
	}
}

