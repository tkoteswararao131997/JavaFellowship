package com.bridgelabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class PowerOf2Test {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		long n=u.powerof2(6);
		assertEquals(64,n);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		long n=u.powerof2(0);
		assertEquals(1,n);
	}
	@Test
	void test2() 
	{
		UtilityLogics u=new UtilityLogics();
		long n=u.powerof2(1);
		assertEquals(2,n);
	}
	@Test
	void test4() 
	{
		UtilityLogics u=new UtilityLogics();
		long n=u.powerof2(10);
		assertEquals(1024,n);
	}

}
