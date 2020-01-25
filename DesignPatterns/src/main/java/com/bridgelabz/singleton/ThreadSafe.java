package com.bridgelabz.singleton;
/**
 * changes:use synchronized when getting instance because in synchronized at a time only one thread will be allowed
 * @author user
 *
 */
public class ThreadSafe 
{
	static ThreadSafe obj;
	private ThreadSafe()
	{
		System.out.println("thread safe");
	}
	public static synchronized ThreadSafe getInstance()
	{
		if(obj==null)
		obj=new ThreadSafe();
		return obj;
	}
//	public static void main(String[] args)
//	{
//		Thread t1=new Thread(new Runnable() 
//		{
//			@Override
//			public void run() 
//			{
//				ThreadSafe obj=ThreadSafe.getInstance();
//			}
//		});
//		Thread t2=new Thread(new Runnable() 
//		{
//			@Override
//			public void run() 
//			{
//				ThreadSafe obj=ThreadSafe.getInstance();
//			}
//		});
//		t1.start();
//		t2.start();
//	}
}
