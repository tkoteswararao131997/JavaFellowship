package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class TemperatureConversionTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		double t=u.temperature(98.1);
		assertEquals(36.72222222222222,t);
	}

	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		double t=u.temperature(0.0);
		assertEquals(-17.77777777777778,t);
	}

}
