package com.bridgelabz.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.repository.UtilityScanner;

import co.bridgelabz.module.AddressBookData;

public class AddressBookmethodsImplementation implements AddressBookMethodsInterface
{
	AddressBookData a=new AddressBookData();
	@Override
	public void addperson() 
	{
		File f=new File("/home/user/Desktop/AddressBook.json");
		if(f.length()==0)
		{
			JSONObject obj=addpersonhelper();
			JSONArray arr=new JSONArray();
			arr.add(obj);
			JSONObject book=new JSONObject();
			book.put("address book",arr);
			try {
				FileWriter fw=new FileWriter("/home/user/Desktop/AddressBook.json");
				fw.write(book.toString());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			JSONArray arr2=readfile();
			JSONObject obj2=addpersonhelper();
			arr2.add(obj2);
			JSONObject book=new JSONObject();
			book.put("address book",arr2);
			try {
				FileWriter fw=new FileWriter("/home/user/Desktop/AddressBook.json");
				fw.write(book.toString());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private JSONObject addpersonhelper() 
	{
		JSONObject obj=new JSONObject();
		System.out.println("enter first name");
		a.setFirstname(UtilityScanner.readString());
		obj.put("firstname",a.getFirstname());
		System.out.println("enter last name");
		a.setLastname(UtilityScanner.readString());
		obj.put("lastname",a.getLastname());
		System.out.println("enter address");
		a.setAddress(UtilityScanner.readString());
		obj.put("address",a.getAddress());
		System.out.println("enter city");
		a.setCity(UtilityScanner.readString());
		obj.put("city",a.getCity());
		System.out.println("enter state");
		a.setState(UtilityScanner.readString());
		obj.put("state",a.getState());
		System.out.println("enter zip code");
		a.setZip(UtilityScanner.readString());
		obj.put("zip",a.getZip());
		System.out.println("enter mobile number");
		a.setPhonenumber(UtilityScanner.readString());
		obj.put("mobilenumber",a.getPhonenumber());
		return obj;
	}

	private JSONArray readfile() 
	{
		try 
		{
			FileReader fr=new FileReader("/home/user/Desktop/AddressBook.json");
			JSONParser p=new JSONParser();
			Object obj=p.parse(fr);
			JSONObject obj2=(JSONObject) obj;
			JSONArray arr=(JSONArray) obj2.get("address book");
			return arr;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void editperson(String name) 
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String firstname=(String) obj.get("firstname");
			if(firstname.equals(name))
			{	
				String address="",city="",state="",zip="",mobilenumber="";
				System.out.println("r u want to change address if yes y no n");
				char ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					address=(String) obj.get("address");
					System.out.println("enter address to change");
					address=UtilityScanner.readString();
				}
				System.out.println("r u want to change city if yes y no n");
				ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					city=(String) obj.get("city");
					System.out.println("enter city to change");
					city=UtilityScanner.readString();
				}
				System.out.println("r u want to change state if yes y no n");
				ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					state=(String) obj.get("state");
					System.out.println("enter state to change");
					state=UtilityScanner.readString();
				}
				System.out.println("r u want to change zipcode if yes y no n");
				ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					zip=(String) obj.get("zip");
					System.out.println("enter zipcode to change");
					zip=UtilityScanner.readString();
				}
				System.out.println("r u want to change mobilenumber if yes y no n");
				ch=UtilityScanner.readChar();
				if(ch=='Y' || ch=='y')
				{
					mobilenumber=(String) obj.get("mobilenumber");
					System.out.println("enter mobilenumber to change");
					mobilenumber=UtilityScanner.readString();
				}
				String lastname=(String) obj.get("lastname");
				JSONObject obj3=new JSONObject();
				obj3.put("firtsname",firstname);
				obj3.put("lastname",lastname);
				obj3.put("address",address);
				obj3.put("city",city);
				obj3.put("state",state);
				obj3.put("zip",zip);
				obj3.put("mobilenumber",mobilenumber);
				arr.remove(i);
				arr.add(i, obj3);
				JSONObject book=new JSONObject();
				book.put("address book",arr);
				try {
					FileWriter fw=new FileWriter("/home/user/Desktop/AddressBook.json");
					fw.write(book.toString());
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void deleteperson(String delete)
	{
		JSONArray arr=readfile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String firstname=(String) obj.get("firstname");
			if(firstname.equals(delete))
			{
				arr.remove(i);
			}
		}
		JSONObject book=new JSONObject();
		book.put("address book",arr);
		try 
		{
			FileWriter fw=new FileWriter("/home/user/Desktop/AddressBook.json");
			fw.write(book.toString());
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void sortlastnames() 
	{
		JSONArray arr=readfile();
		JSONObject obj=new JSONObject();
		JSONObject obj2=new JSONObject();
		for (int i = 0; i < arr.size(); i++) 
		{
			obj=(JSONObject) arr.get(i);
			String iname=(String) obj.get("lastname");
			for (int j = 0; j < arr.size(); j++) 
			{
				obj2=(JSONObject) arr.get(j);
				String jname=(String) obj2.get("lastname");
				if(iname.compareTo(jname)>0)
				{
					System.out.println("in");
					JSONObject temp=(JSONObject) arr.get(i);
					System.out.println(temp);
					System.out.println(i+" "+j);
					arr.add(i, obj2);
					System.out.println(arr);
					arr.add(j, temp);
					System.out.println(arr);
				}
				
			}
		}
		JSONObject book=new JSONObject();
		book.put("address book",arr);
		try 
		{
			FileWriter fw=new FileWriter("/home/user/Desktop/AddressBook.json");
			fw.write(book.toString());
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void sortzipcodes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printpersons() {
		// TODO Auto-generated method stub
		
	}
	
}
