package com.bridgelabz.module;

public class CliniqueDoctorData 
{
	private String dname;
	private String did;
	private String dspecialization;
	private String davaliability;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDspecialization() {
		return dspecialization;
	}
	public void setDspecialization(String dspecialization) {
		this.dspecialization = dspecialization;
	}
	public String getDavaliability() {
		return davaliability;
	}
	public void setDavaliability(String davaliability) {
		this.davaliability = davaliability;
	}
	public String toString()
	{
		return "doctorname:"+dname+"doctorid:"+did+"doctorspecialization:"+dspecialization+"doctoravaliability:"+davaliability;
	}
	
}
