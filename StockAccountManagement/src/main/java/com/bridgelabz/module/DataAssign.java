package com.bridgelabz.module;

public class DataAssign
{
	private String stockname;
	private int numberofshares;
	private long shareprice;
	public String getCompanyname() {
		return stockname;
	}
	public void setCompanyname(String companyname) {
		this.stockname = companyname;
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
		return "companyname:"+stockname+",numberofshares:"+numberofshares+",shareprice:"+shareprice;
	}
}
