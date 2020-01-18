package com.bridgelabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class LeapYearTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		boolean b=u.isLeapYear(1987);
		assertEquals(true,b);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		boolean b=u.isLeapYear(1900);
		assertEquals(false,b);
	}
	@Test
	void test2() 
	{
		UtilityLogics u=new UtilityLogics();
		boolean b=u.isLeapYear(1966);
		assertEquals(false,b);
	}
	@Test
	void test3() 
	{
		UtilityLogics u=new UtilityLogics();
		boolean b=u.isLeapYear(1980);
		assertEquals(true,b);
	}
	@Test
	void test4() 
	{
		UtilityLogics u=new UtilityLogics();
		boolean b=u.isLeapYear(2000);
		assertEquals(true,b);
	}
}
