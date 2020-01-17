package com.bridgelabz.AlgorithmprogramsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class InsertionTest {

	@Test
	void test() 
	{
		String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
		String[] sort={"Omaha","Dallas","Atlanta","New York","San Francisco"};
		UtilityLogics u=new UtilityLogics();
		String res[]=u.insertionsort(arr);
		assertEquals(sort,res);
	}

}
