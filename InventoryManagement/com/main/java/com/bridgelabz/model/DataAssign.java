package com.bridgelabz.model;

public class DataAssign
{
	private String name;
	private double weight;
	private double price;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "name="+name+", weight="+weight+", price="+price;
	}
}
