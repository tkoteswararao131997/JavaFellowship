package com.bridgelabz.PrototypeDesign;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable
{

	private List<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list){
		this.empList=list;
	}
	public void loadData()
	{
		empList.add("koti");
		empList.add("karim");
		empList.add("firoz");
		empList.add("hima");
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
}