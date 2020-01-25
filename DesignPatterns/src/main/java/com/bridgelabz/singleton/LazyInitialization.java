package com.bridgelabz.singleton;
/**
 * same as eagerinitialization
 * @author koti
 * changes:but we can declare obj only not created it is created if obj is null otherwise not
 * problem:if there are two threads are running at same time then two obj will be created
 *
 */
public class LazyInitialization 
{
	static LazyInitialization obj;//lazy initialization
	private LazyInitialization()
	{
		System.out.println("lazy initialization");
	}
	public static LazyInitialization getInstance()
	{
		if(obj==null)
		{
		obj=new LazyInitialization();
		}
		return obj;
	}
//	public static void main(String[] args) 
//	{
//		LazyInitialization obj=LazyInitialization.getInstance();
//		LazyInitialization obj2=LazyInitialization.getInstance();
//	}
}
