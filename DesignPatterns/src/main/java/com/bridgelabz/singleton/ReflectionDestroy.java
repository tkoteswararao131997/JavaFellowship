package com.bridgelabz.singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
