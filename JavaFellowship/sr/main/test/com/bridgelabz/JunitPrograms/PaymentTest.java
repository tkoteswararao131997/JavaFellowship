package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class PaymentTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		double payment=u.monthlypayment(4200, 2, 3);
		assertEquals(180.52109031413946,payment);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		double payment=u.monthlypayment(35000, 5, 6);
		assertEquals(676.6480535299896,payment);
	}
	@Test
	void test2() 
	{
		UtilityLogics u=new UtilityLogics();
		double payment=u.monthlypayment(1,1,0.1);
		assertEquals(0.08337847911804976,payment);
	}
	


}
