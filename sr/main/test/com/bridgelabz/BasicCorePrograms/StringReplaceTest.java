package com.bridgelabz.BasicCorePrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.UtilityLogics;

class StringReplaceTest {

	@Test
	void test() 
	{
		UtilityLogics u=new UtilityLogics();
		String s=u.replaceString("koti");
		assertEquals("Hello koti,how are you",s);
	}
	@Test
	void test1() 
	{
		UtilityLogics u=new UtilityLogics();
		String s=u.replaceString("");
		assertEquals("Hello ,how are you",s);
	}
	@Test
	void test2()
	{
		UtilityLogics u=new UtilityLogics();
		String s=u.replaceString("\"koti\"");
		assertEquals("Hello \"koti\",how are you",s);
	}
}
