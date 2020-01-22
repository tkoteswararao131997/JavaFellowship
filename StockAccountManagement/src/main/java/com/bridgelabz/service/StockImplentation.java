package com.bridgelabz.service;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.repository.UtilityScanner;

public class StockImplentation implements StockInterface 
{

	@Override
	public double eachstockval(String particularstock) 
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String stockname=(String) obj.get("stockname");
			if(stockname.equalsIgnoreCase(particularstock))
			{
			long  numberofshares=(long) obj.get("numberofshares");
			long shareprice=(long) obj.get("shareprice");
			return numberofshares*shareprice;
			}
		}
		return 0;
	}

	@Override
	public double allstockval() 
	{
		JSONArray arr=readfile();
		double total=0.0;
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			long  numberofshares=(long) obj.get("numberofshares");
			long shareprice=(long) obj.get("shareprice");
			total=total+(numberofshares*shareprice);
		}
		return total;
	}
	public JSONArray readfile()
	{
		
		try {
			FileReader fr= new FileReader("/home/user/Desktop/Stock");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONObject obj2=(JSONObject) obj;
			JSONArray arr=(JSONArray) obj2.get("sharedetails");
			return arr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONArray empty=new JSONArray();
		return empty;
		
	}

}
