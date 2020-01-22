package com.bridgelabz.module;

public class DataAssign
{
	private String stockname;
	private int numberofshares;
	private long shareprice;
//	public DataAssign(String stockname,int numberofshare,long shareprice)
//	{
//		this.stockname=stockname;
//		this.numberofshares=numberofshare;
//		this.shareprice=shareprice;
//	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public long getShareprice() {
		return shareprice;
	}
	public void setShareprice(long shareprice) {
		this.shareprice = shareprice;
	}
	public int getNumberofshare() {
		return numberofshares;
	}
	public void setNumberofshare(int numberofshare) {
		this.numberofshares = numberofshare;
	}
	public String toString()
	{
		return "stockname:"+stockname+",numberofshares:"+numberofshares+",shareprice:"+shareprice;
	}
}
