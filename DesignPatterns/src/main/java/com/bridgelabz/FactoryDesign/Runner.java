package com.bridgelabz.FactoryDesign;

public class Runner 
{
	public static void main(String[] args) 
	{
		Computer pc=ComputerFactory.getComputer("Pc","8GB","1TB","2.8GHZ");
		System.out.println(pc);
		
	}
}
