package org.peopleTech.example.HelloWorld_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {
	
	@Test
	public void test()
	{
		System.out.println("++++++++++CICT++++++++++++");
		Assert.assertEquals("100", "100");
	}
}
