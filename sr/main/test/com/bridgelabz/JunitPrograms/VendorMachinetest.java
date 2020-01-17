package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class VendorMachinetest 
{
	int notes[]= {1,2,5,10,50,100,500,1000};
	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		long vendor=u.vendingmachine(notes,3678);
		assertEquals(11,vendor);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		long vendor=u.vendingmachine(notes,0);
		assertEquals(0,vendor);
	}
	@Test
	void test2() 
	{
		UtilityLogics u=new UtilityLogics();
		long vendor=u.vendingmachine(notes,1087);
		assertEquals(7,vendor);
	}

}
