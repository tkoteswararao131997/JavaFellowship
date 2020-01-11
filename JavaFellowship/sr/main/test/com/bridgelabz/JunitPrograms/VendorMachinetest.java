package com.bridgelabz.JunitPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class VendorMachinetest 
{
	int notes[]= {1,2,5,10,50,100,500,2000};
	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		long vendor=u.vendingmachine(notes,3678);
		System.out.println(vendor);
		assertEquals(12,vendor);
	}

}
