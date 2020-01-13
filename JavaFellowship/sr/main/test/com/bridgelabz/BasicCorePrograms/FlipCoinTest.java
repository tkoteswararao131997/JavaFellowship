package com.bridgelabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;
/**
 * vesrion 1.0
 * @author koti
 *to test the flipcoin class and method in different ways
 */
class FlipCoinTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		double d=u.flipcoinper(10);
		assertEquals(100,d);
	}

}
