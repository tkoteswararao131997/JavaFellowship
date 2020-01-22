package com.bridgelabz.service;

public interface StockInterface 
{
	public double eachstockval(String particularstockvalue);
	public double allstockval();
	public double valueof();
	public void buy(int amount,String symbols);
	public void sell(int amount,String symbols);
	void printreport();
}
