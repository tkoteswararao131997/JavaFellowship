package com.bridgelabz.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.module.CliniqueDoctorData;
import com.bridgelabz.module.CliniquePatientData;
import com.bridgelabz.repository.UtilityScanner;

public class CliniqueMethodsImplementation implements CliniqueMethodsInterface 
{

	@Override
	public void addDoctor() 
	{
		File f=new File("/home/user/Desktop/cliniquedoctor.json");
		boolean b=false;
		if(f.length()==0)
		{
			adddoctorhelper(b);
		}
		else
		{
			b=true;
			adddoctorhelper(b);
		}
	}
	private void adddoctorhelper(boolean b)
	{
		CliniqueDoctorData d=new CliniqueDoctorData();
		JSONArray arr=new JSONArray();
		if(b==true)
		{
			arr=readfiledoctor();
		}
		JSONObject obj=new JSONObject();
		System.out.println("enter doctor name");
		d.setDname(UtilityScanner.readString());
		obj.put("name",d.getDname());
		System.out.println("enter doctor id");
		d.setDid(UtilityScanner.readString());
		obj.put("id",d.getDid());
		System.out.println("enter doctor specialization");
		d.setDspecialization(UtilityScanner.readString());
		obj.put("specialization",d.getDspecialization());
		System.out.println("enter doctor avaliability");
		d.setDavaliability(UtilityScanner.readString());
		obj.put("avaliability",d.getDavaliability());
		obj.put("appointments",0);
		arr.add(obj);
		JSONObject newobj=new JSONObject();
		newobj.put("doctordetails", arr);
		try {
			FileWriter fw=new FileWriter("/home/user/Desktop/cliniquedoctor.json");
			fw.write(newobj.toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private JSONArray readfiledoctor() 
	{
		try {
			FileReader fr=new FileReader("/home/user/Desktop/cliniquedoctor.json");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONObject newobj=(JSONObject) obj;
			JSONArray arr=(JSONArray) newobj.get("doctordetails");
			return arr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean searchDoctor(String anything) 
	{
		int j=0;
		boolean b=false;
		JSONArray arr=readfiledoctor();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String name=(String) obj.get("name");
			String id=(String)obj.get("id");
			String specialization=(String)obj.get("specialization");
			String avaliability=(String)obj.get("avaliability");
			if(anything.equals(name) || anything.equals(id) || anything.equals(specialization) || anything.equals(avaliability))
			{
				j++;
				System.out.println("doctor details:");
				System.out.println("name:"+name+",id:"+id+",specialization:"+specialization+",avaliability:"+avaliability);
				b=true;
			}
			else
			{
				if(i==arr.size()-1 && j==0)
				System.out.println("no doctors found");
				return b;
			}
			
		}
		return b;
	}
	@Override
	public void addPatient() 
	{
		File f=new File("/home/user/Desktop/cliniquepatient.json");
		boolean b=false;
		if(f.length()==0)
		{
			addpatienthelper(b);
		}
		else
		{
			b=true;
			addpatienthelper(b);
		}
	}

	private void addpatienthelper(boolean b) 
	{
		CliniquePatientData p=new CliniquePatientData();
		JSONArray arr=new JSONArray();
		if(b==true)
		{
			arr=readfilepatient();
		}
		JSONObject obj=new JSONObject();
		System.out.println("enter patient name");
		p.setPname(UtilityScanner.readString());
		obj.put("name",p.getPname());
		System.out.println("enter patient id");
		p.setPid(UtilityScanner.readString());
		obj.put("id",p.getPid());
		System.out.println("enter patient mobile num");
		p.setPmno(UtilityScanner.readString());
		obj.put("mobilenumber",p.getPmno());
		System.out.println("enter patient age");
		p.setPage(UtilityScanner.readInteger());
		obj.put("age",p.getPage());
		arr.add(obj);
		JSONObject newobj=new JSONObject();
		newobj.put("patientdetails", arr);
		try {
			FileWriter fw=new FileWriter("/home/user/Desktop/cliniquepatient.json");
			fw.write(newobj.toString());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private JSONArray readfilepatient() 
	{
		try {
			FileReader fr=new FileReader("/home/user/Desktop/cliniquepatient.json");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONObject newobj=(JSONObject) obj;
			JSONArray arr=(JSONArray) newobj.get("patientdetails");
			return arr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void searchPatient(String anything) 
	{
		int j=0;
		JSONArray arr=readfilepatient();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject obj=(JSONObject) arr.get(i);
			String name=(String) obj.get("name");
			String id=(String)obj.get("id");
			String mobilenumber=(String)obj.get("mobilenumber");
			long ag=(long)obj.get("age");
			String age=String.valueOf(ag);
			if(anything.equals(name) || anything.equals(id) || anything.equals(mobilenumber) || anything.equals(age))
			{
				j++;
				System.out.println("doctor details:");
				System.out.println("name:"+name+",id:"+id+",mobilenumber:"+mobilenumber+",age:"+age);
			}
			else
			{
				if(i==arr.size()-1 && j==0)
				System.out.println("no patients found");
			}
			
		}
	}
	public void appointment(String anything, String patient) 
	{
		boolean b=searchDoctor(anything);
		JSONArray arr=readfiledoctor();
		if(b==true)
		{
			for (int i = 0; i < arr.size(); i++) 
			{
				JSONObject obj=(JSONObject) arr.get(i);
				String name=(String) obj.get("name");
				String p=patient;
				if(name.equals(anything))
				{
					long app=(long) obj.get("appointments");
					if(app<6)
					{
					app=app+1;
					System.out.println(app);
					}
					File f=new File("/home/user/Desktop/appointment.json");
					if(f.length()==0)
					{
						JSONObject appointment=new JSONObject();
						appointment.put(name, p);
						try {
							FileWriter fw=new FileWriter("/home/user/Desktop/appointment.json");
							fw.write(appointment.toString());
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					else
					{
						try {
							FileReader fr=new FileReader("/home/user/Desktop/appointment.json");
							JSONParser pars=new JSONParser();
							Object obj2=pars.parse(fr);
							JSONObject obj3=(JSONObject) obj2;
							obj3.put(name,p);
							try {
								FileWriter fw=new FileWriter("/home/user/Desktop/appointment.json");
								fw.write(obj3.toString());
								fw.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
}
