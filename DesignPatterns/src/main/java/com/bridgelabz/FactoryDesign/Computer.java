package com.bridgelabz.FactoryDesign;

public  abstract class Computer 
{
	public abstract String getRam();
	public abstract String getHdd();
	public abstract String getCpu();
	public String toString()
	{
		return "Ram:"+getRam()+",Hard disk:"+getHdd()+",Cpu:"+getCpu();
	}
}
