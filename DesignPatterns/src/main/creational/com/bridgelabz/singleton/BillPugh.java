package com.bridgelabz.singleton;

public class BillPugh 
{
	private BillPugh()
	{
		System.out.println("Billbugh");
	}
	public static BillPugh getInstance()
	{
		return BillpughInner.obj;
	}
	private static class BillpughInner
	{
		private static BillPugh obj=new BillPugh();
	}
	public static void main(String[] args) 
	{
		BillPugh obj=BillPugh.getInstance();
		BillPugh obj2=BillPugh.getInstance();
		
	}
}
