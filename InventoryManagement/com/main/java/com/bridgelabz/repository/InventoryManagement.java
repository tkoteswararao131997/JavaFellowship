package com.bridgelabz.repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.Service.InventoryImplementation;

public class InventoryManagement 
{
	InventoryImplementation imp=new InventoryImplementation();
	public void filewrite() throws IOException
	{
		imp.addinventory();
		FileWriter fw=new FileWriter("/home/user/InventoryDataManagement");
		
	}
	public void fileread()
	{
		
	}
}
