package com.bridgelabz.repository;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.module.DataAssign;

public class Stockportfolio 
{
	public static void main(String[] args) 
	{
		DataAssign d=new DataAssign();
		System.out.println("enter no.of shares");
		int n=UtilityScanner.readInteger();
		JSONArray arr=new JSONArray();
		for (int i = 0; i < n; i++) 
		{
			JSONObject obj1=new JSONObject();
			System.out.println("enter stock name");
			d.setStockname(UtilityScanner.readString());
			obj1.put("stockname",d.getStockname());
			d.setNumberofshare(UtilityScanner.readInteger());
			obj1.put("numberofshares",d.getNumberofshare());
			d.setShareprice(UtilityScanner.readLong());
			obj1.put("shareprice",d.getShareprice());
			arr.add(obj1);
			if(i==n-1)
			{
			JSONObject newobj=new JSONObject();
			newobj.put("companies",arr);
			JSONArray company=new JSONArray();
			company.add(newobj);
			try {
				FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
				fw.write(company.toString());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
}

