package com.bridgelabz.repository;

import java.util.Scanner;

public class UtilityScanner
{
	private static final Scanner sc=new Scanner(System.in);
	public static int readInteger()
	{
		System.out.println("enter integer value");
		return sc.nextInt();
	}
	public static double readDouble()
	{
		System.out.println("enter double value");
		return sc.nextDouble();
	}
	public static boolean readBoolean()
	{
		System.out.println("enter boolean value");
		return sc.nextBoolean();
	}
	public static byte readByte()
	{
		System.out.println("enter byte value");
		return sc.nextByte();
	}
	public static String readString()
	{
		System.out.println("enter string:");
		return sc.next();
	}
	public static float readFloat()
	{
		System.out.println("enter float value");
		return sc.nextFloat();
	}
	public static long readLong()
	{
		System.out.println("enter long value");
		return sc.nextLong();
	}
	public static char readChar()
	{
		System.out.println("enter char value");
		return sc.next().charAt(0);
	}
	
}