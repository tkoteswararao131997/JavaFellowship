package com.bridgelabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class HarmonicTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		double d=u.harmonic(2);
		assertEquals(1.5,d);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		double d=u.harmonic(5);
		assertEquals(2.283333333333333,d);
	}
	@Test
	void test2() 
	{
		UtilityLogics u=new UtilityLogics();
		double d=u.harmonic(0);
		assertEquals(0,d);
	}
	

}
