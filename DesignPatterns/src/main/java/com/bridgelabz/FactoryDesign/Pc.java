package com.bridgelabz.FactoryDesign;

public class Pc extends Computer 
{
	String ram;
	String hdd;
	String cpu;
	public Pc(String ram,String hdd,String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRam() 
	{
		return this.ram;
	}

	@Override
	public String getHdd() 
	{
		return this.hdd;
	}

	@Override
	public String getCpu() 
	{
		return this.cpu;
	}
	
}
