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
		JSONObject obj1=new JSONObject();
		d.setStockname("jio");
		obj1.put("stockname",d.getStockname());
		d.setNumberofshare(2);
		obj1.put("numberofshares",d.getNumberofshare());
		d.setShareprice(4000);
		obj1.put("shareprice",d.getShareprice());
		JSONObject obj2=new JSONObject();
		d.setStockname("gold");
		obj2.put("stockname",d.getStockname());
		d.setNumberofshare(5);
		obj2.put("numberofshares",d.getNumberofshare());
		d.setShareprice(7000);
		obj2.put("shareprice",d.getShareprice());
		JSONObject obj3=new JSONObject();
		d.setStockname("car");
		obj3.put("stockname",d.getStockname());
		d.setNumberofshare(10);
		obj3.put("numberofshares",d.getNumberofshare());
		d.setShareprice(15000);
		obj3.put("shareprice",d.getShareprice());
		JSONArray arr=new JSONArray();
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		System.out.println(arr);
		JSONObject share=new JSONObject();
		share.put("sharedetails",arr);
		try {
			FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
			fw.write(share.toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(arr);
//		DataAssign d=new DataAssign("jio", 2, 3000);
//		JSONObject obj1=new JSONObject();
//		obj1.put("sharedetails",d);
//		System.out.println(obj1);
//		JSONObject share=(JSONObject) obj1.get("sharedetails");
//		String stockname=(String) share.get("stockname");
//		System.out.println(stockname);
//		
		
	}
}
