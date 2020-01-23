package com.bridgelabz.module;

public class CliniquePatientData 
{
	private String pname;
	private String pid;
	private String pmno;
	private int page;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPmno() {
		return pmno;
	}
	public void setPmno(String pmno) {
		this.pmno = pmno;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String toString()
	{
		return "patientname:"+pname+"patientid:"+pid+"patientmobile:"+pmno+"patientage:"+page;
	}
}
