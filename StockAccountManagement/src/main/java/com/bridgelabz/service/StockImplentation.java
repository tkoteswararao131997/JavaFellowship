package com.bridgelabz.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.module.DataAssign;
import com.bridgelabz.repository.LinkedList;
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
			System.out.println(obj);
			String stockname=(String) obj.get("stockname");
			System.out.println(stockname);
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
			FileReader fr=new FileReader("/home/user/Desktop/Stock");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONObject newobj=(JSONObject) obj;
			System.out.println(newobj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public double valueof() 
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

	@SuppressWarnings("unchecked")
	@Override
	public void buy(int amount, String symbols) 
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String stockname=(String) obj.get("stockname");
			if(stockname.equalsIgnoreCase(symbols))
			{
				long numberofshares=(long) obj.get("numberofshares");
				numberofshares=numberofshares+amount;
				long shareprice=(long)obj.get("shareprice");
				arr.remove(i);
				JSONObject newobj=new JSONObject();
				newobj.put("stockname",stockname);
				newobj.put("numberofshares",numberofshares);
				newobj.put("shareprice",shareprice);
				arr.add(i,newobj);
				JSONObject share=new JSONObject();
				share.put("companies",arr);
				try {
					FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
					fw.write(share.toString());
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public void sell(int amount, String symbols)
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String stockname=(String) obj.get("stockname");
			if(stockname.equalsIgnoreCase(symbols))
			{
				long numberofshares=(long) obj.get("numberofshares");
				numberofshares=numberofshares-amount;
				long shareprice=(long)obj.get("shareprice");
				arr.remove(i);
				JSONObject newobj=new JSONObject();
				newobj.put("stockname",stockname);
				newobj.put("numberofshares",numberofshares);
				newobj.put("shareprice",shareprice);
				arr.add(i,newobj);
				JSONObject share=new JSONObject();
				share.put("companies",arr);
				try {
					FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
					fw.write(share.toString());
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	@Override
	public void printreport() 
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String stockname=(String) obj.get("stockname");
			long numberofshares=(long) obj.get("numberofshares");
			long shareprice=(long)obj.get("shareprice");
			JSONObject newobj=new JSONObject();
			System.out.println("stockname:"+stockname);
			System.out.println("numberofshares:"+numberofshares);
			System.out.println("shareprice"+shareprice);
			System.out.println();
			}
	}
	public void addcompany()
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
			try {
				FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
				fw.write(newobj.toString());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	}
	public void deletecompany(String company)
	{
		LinkedList l=new LinkedList();
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String stockname=(String) obj.get("stockname");
			l.add(stockname,i);
			long numberofshares=(long) obj.get("numberofshares");
			long shareprice=(long) obj.get("shareprice");
			l.add(numberofshares,i);
			l.add(shareprice,i);
		}
		l.remove(company);
		arr.remove(company);
		JSONObject newobj=new JSONObject();
		newobj.put("companies",arr);
		try {
			FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
			fw.write(newobj.toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
