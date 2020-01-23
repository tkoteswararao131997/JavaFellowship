package com.bridgelabz.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.module.DataAssign;
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
			String companyname=(String) obj.get("companyname");
			if(companyname.equalsIgnoreCase(particularstock))
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
			JSONParser p=new JSONParser();
			Object o=p.parse(fr);
			JSONObject obj=(JSONObject) o;
			JSONArray arr=(JSONArray) obj.get("companies");
			return arr;
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
			String companyname=(String) obj.get("companyname");
			if(companyname.equalsIgnoreCase(symbols))
			{
				long numberofshares=(long) obj.get("numberofshares");
				numberofshares=numberofshares+amount;
				long shareprice=(long)obj.get("shareprice");
				arr.remove(i);
				JSONObject newobj=new JSONObject();
				newobj.put("companyname",companyname);
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
			String companyname=(String) obj.get("companyname");
			if(companyname.equalsIgnoreCase(symbols))
			{
				long numberofshares=(long) obj.get("numberofshares");
				numberofshares=numberofshares-amount;
				long shareprice=(long)obj.get("shareprice");
				arr.remove(i);
				JSONObject newobj=new JSONObject();
				newobj.put("companyname",companyname);
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
			JSONObject obj2=(JSONObject) obj.get("companies");
			String companyname=(String) obj.get("companyname");
			long numberofshares=(long) obj.get("numberofshares");
			long shareprice=(long)obj.get("shareprice");
			JSONObject newobj=new JSONObject();
			System.out.println("companyname:"+companyname);
			System.out.println("numberofshares:"+numberofshares);
			System.out.println("shareprice"+shareprice);
			System.out.println();
			}
	}
	@SuppressWarnings("unchecked")
	public void addcompany()
	{
		File fr=new File("/home/user/Desktop/Stock");
		boolean b=false;
		if(fr.length()==0)
		{
			b=true;
			addcompanyhelper(b);
		}
		else
		{
			addcompanyhelper(b);
		}
	}
	@SuppressWarnings("unchecked")
	private void addcompanyhelper(boolean b) 
	{
		JSONArray arr=new JSONArray();
		if(b==false)
		{
			arr=readfile();
		}
		DataAssign d=new DataAssign();
		JSONObject obj1=new JSONObject();
		System.out.println("enter company name");
		d.setCompanyname(UtilityScanner.readString());
		obj1.put("companyname",d.getCompanyname());
		System.out.println("enter no.of shares");
		d.setNumberofshare(UtilityScanner.readInteger());
		obj1.put("numberofshares",d.getNumberofshare());
		System.out.println("enter share price");
		d.setShareprice(UtilityScanner.readLong());
		obj1.put("shareprice",d.getShareprice());
		arr.add(obj1);
		JSONObject newobj=new JSONObject();
		newobj.put("companies",arr);
		try 
		{
			FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
			fw.write(newobj.toString());
			fw.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@SuppressWarnings({"unchecked" })
	public void deletecompany(String company)
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String stockname=(String) obj.get("companyname");
			if(stockname.equals(company))
			{
			arr.remove(i);
			}
		}
		JSONObject newobj=new JSONObject();
		newobj.put("companies",arr);
		try {
			FileWriter fw=new FileWriter("/home/user/Desktop/Stock");
			fw.write(newobj.toString());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
