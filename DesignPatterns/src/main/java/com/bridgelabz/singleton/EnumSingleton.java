package com.bridgelabz.singleton;

public enum EnumSingleton 
{
	INSTANCE;
//	private EnumSingleton()
//	{
//		System.out.println("hello");
//	}
	public void someMeth(String str)
	{
		//write something
	}
	public static void main(String[] args) {
		System.out.println(EnumSingleton.INSTANCE);
	}
}
