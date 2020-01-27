package com.bridgelabz.singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * By using reflection we can break the concept of singleton that means we can create more than one instance for one class
 */
public class ReflectionDestroy 
{
	public static void main(String[] args) 
	{
		EagerInitialization obj1=EagerInitialization.getinstance();
		EagerInitialization obj2=null;
		Constructor[] cons=EagerInitialization.class.getDeclaredConstructors();
		for(Constructor c : cons)
		{
			try 
			{
				c.setAccessible(true);
				obj2=(EagerInitialization) c.newInstance();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
