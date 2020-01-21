package com.bridgelabz.Service;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.DataAssign;
import com.bridgelabz.repository.UtilityScanner;

public class InventoryImplementation implements InventryInterface
{
	JSONArray arr=new JSONArray();
	@Override
	public void addinventory()
	{
		try 
		{
			DataAssign inventory=new DataAssign();
			FileReader fr=new FileReader("/home/user/InventoryDataManagement");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONArray arr=(JSONArray) obj;
			JSONObject jo=new JSONObject();
			System.out.println("enter product name");
			inventory.setName(UtilityScanner.readString());//set product name
			jo.put("name",inventory.getName());
			System.out.println("enter weight");
			inventory.setWeight(UtilityScanner.readDouble());
			jo.put("weight",inventory.getWeight());
			System.out.println("enter price");
			inventory.setPrice(UtilityScanner.readDouble());
			jo.put("price",inventory.getPrice());
			JSONObject newobj=new JSONObject();
			newobj.put("Inventory",jo);
			arr.add(newobj);
			FileWriter fw=new FileWriter("/home/user/InventoryDataManagement");
			fw.write(arr.toString());
			fw.close();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void showinventory() 
	{
			JSONArray arr=readfile();
			arr.forEach(emp -> display((JSONObject)emp));
	}

	private JSONArray readfile() 
	{
		try {
			FileReader fr=new FileReader("/home/user/InventoryDataManagement");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONArray arr=(JSONArray)obj;
		return arr;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		JSONArray empty=new JSONArray();
		return empty;
	}

	private void display(JSONObject emp)
	{
		JSONObject inventory=(JSONObject) emp.get("Inventory");
		String name=(String) inventory.get("name");
		String weight=String.valueOf(inventory.get("weight"));
		String price=String.valueOf(inventory.get("price"));
		System.out.println("name:"+name+"\nweight:"+weight+"\nprice:"+price+"\n");	
	}

	@Override
	public double calculateinventory() 
	{
		double inv=0;
		System.out.println("enter product name to calulate");
		String cal=UtilityScanner.readString();
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject inventory=(JSONObject) arr.get(i);
			JSONObject obj=(JSONObject) inventory.get("Inventory");
			String name=(String) obj.get("name");
			if(cal.equalsIgnoreCase(name))
			{
			double weight=(double) obj.get("weight");
			double price=(double) obj.get("price");
			inv=weight*price;
			}
		}
		return inv;
	}
	@Override
	public void removeinventory() 
	{
		System.out.println("enter name of product:");
		String remove=UtilityScanner.readString();
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			JSONObject inventory=(JSONObject) obj.get("Inventory");
			String name=(String) inventory.get("name");
			if(name.equalsIgnoreCase(remove))
			{
				System.out.println("in");
				arr.remove(i);
				try {
					FileWriter fw=new FileWriter("/home/user/InventoryDataManagement");
					fw.write(arr.toString());
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	@Override
	public double totalweight() 
	{
		double total=0;
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			JSONObject inventory=(JSONObject) obj.get("Inventory");
			double weight=(double) inventory.get("weight");
			total=total+weight;
		}
		return total;
	}

	@Override
	public double totalprice()
	{
		double total=0;
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			JSONObject inventory=(JSONObject) obj.get("Inventory");
			double weight=(double) inventory.get("weight");
			double price=(double)inventory.get("price");
			total=total+(weight*price);
		}
		return total;
	}

	public void editinventory() 
	{	
		System.out.println("enter product name to edit");
		String edit=UtilityScanner.readString();
		JSONArray arr=readfile();
		String name="";
		double weight=0.0,price=0.0;
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			JSONObject inventory=(JSONObject) obj.get("Inventory");
			name=(String) inventory.get("name");
			if(name.equalsIgnoreCase(edit))
			{
				System.out.println("r u want to change the name of product\npress Y for yes N for no");
				char ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					System.out.println("enter name");
					name=(String)inventory.get("name");
					name=UtilityScanner.readString();
				}
				else
				{
					name=(String)inventory.get("name");
				}
				System.out.println("r u want to change the weight of product\npress Y for yes N for no");
				ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					System.out.println("enter weight");
					weight=(double) inventory.get("weight");
					weight=UtilityScanner.readDouble();
				}
				else
				{
					weight=(double) inventory.get("weight");
				}
				System.out.println("r u want to change the price of product\npress Y for yes N for no");
				ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					System.out.println("enter price");
					price=(double) inventory.get("price");
					price=UtilityScanner.readDouble();
				}
				else
					price=(double) inventory.get("price");
				JSONObject newobj=new JSONObject();
				newobj.put("name",name);
				newobj.put("weight", weight);
				newobj.put("price",price);
				JSONObject newassign=new JSONObject();
				newassign.put("Inventory",newobj);
				arr=readfile();
				arr.remove(i);
				arr.add(i, newassign);
				try
				{
				FileWriter fw=new FileWriter("/home/user/InventoryDataManagement");
				fw.write(arr.toString());
				fw.close();
				} catch (IOException e) 
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				break;
			}
				
				
				
				
		
	}
	}
}
