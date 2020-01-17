package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class DayOfWeekTest {

	@Test
	void test()
	{
		UtilityLogics u=new UtilityLogics();
		int day=u.dayofweek(13, 1, 2020);
		assertEquals(1,day);
	}
	@Test
	void test1()
	{
		UtilityLogics u=new UtilityLogics();
		int day=u.dayofweek(16,22,1996);
		assertEquals(6,day);
	}
	@Test
	void test2()
	{
		UtilityLogics u=new UtilityLogics();
		int day=u.dayofweek(30,12, 2020);
		assertEquals(3,day);
	}
}
