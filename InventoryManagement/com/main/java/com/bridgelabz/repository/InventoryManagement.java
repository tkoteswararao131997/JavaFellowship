package com.bridgelabz.repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.Service.InventoryImplementation;
import com.bridgelabz.model.DataAssign;

public class InventoryManagement 
{
	InventoryImplementation imp=new InventoryImplementation();
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException
	{
		DataAssign inventory=new DataAssign();
		JSONObject obj=new JSONObject();
		inventory.setName(UtilityScanner.readString());
		obj.put("name",inventory.getName());
		inventory.setWeight(UtilityScanner.readDouble());
		obj.put("weight", inventory.getWeight());
		inventory.setPrice(UtilityScanner.readDouble());
		obj.put("price",inventory.getPrice());
		JSONObject inv1=new JSONObject();
		inv1.put("Inventory",obj);
		JSONArray arr=new JSONArray();
		arr.add(inv1);
		System.out.println(arr);
		FileWriter fw=new FileWriter("/home/user/InventoryDataManagement");
		fw.write(arr.toString());
		fw.close();
	}
}
