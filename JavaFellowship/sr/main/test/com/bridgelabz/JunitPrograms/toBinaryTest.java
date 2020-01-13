package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class toBinaryTest {

	@Test
	void test() 
	{
		UtilityLogics u= new UtilityLogics();
		String s=u.tobinary(7);
		assertEquals("111",s);
	}
	@Test
	void test1() 
	{
		UtilityLogics u= new UtilityLogics();
		String s=u.tobinary(0);
		assertEquals("",s);
	}
	@Test
	void test2() 
	{
		UtilityLogics u= new UtilityLogics();
		String s=u.tobinary(100);
		assertEquals("1100100",s);
	}

}
