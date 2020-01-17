package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class BinarynibblesTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		int n=u.binaryNibbles(100);
		assertEquals(70,n);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		int n=u.binaryNibbles(7);
		assertEquals(112,n);
	}
	@Test
	void test2() 
	{
		UtilityLogics u=new UtilityLogics();
		int n=u.binaryNibbles(0);
		assertEquals(0,n);
	}
}
