package com.bridgelabz.singleton;
/**
 * singleton class is anothing but an create only one single instance for a class
 * mainly it follows 3 steps
 * step-1:create instance as static
 * step-2:create constructor as private
 * step-3:create method as static and return instace
 * @author koti
 *version 1.0
 */
public class SingleTonRepresentation 
{
	static SingleTonRepresentation str=new SingleTonRepresentation();
	private SingleTonRepresentation()
	{
		System.out.println("instance created");
	}
	public static SingleTonRepresentation getInstance()
	{
		return str;
	}
}
