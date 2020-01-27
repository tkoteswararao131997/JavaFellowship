package com.bridgelabz.singleton;
/**
 * enum is a special type of class which creates single object called INSTANCE.In enum it had inbuilt private constructor
 *  which assigning class instance as INSTANCE.
 * @author user
 * problem:it doesnt support for lazy singleton.because in lazy singleton we initializing in main method byt here INSTANCE is already created.
 *
 */
public enum EnumSingleton 
{
	INSTANCE;
//	private EnumSingleton()
//	{
//		System.out.println("hello");
//	}
//	int i;
	public  void someMeth()
	{
//		System.out.println(i);
		//do something
	}
//	public static void main(String[] args) 
//	{
//		EnumSingleton obj=EnumSingleton.INSTANCE;
//		obj.i=10;
//		obj.someMeth();
//		EnumSingleton obj1=EnumSingleton.INSTANCE;
//		obj1.i=20;
//		obj.someMeth();
//	}
}
