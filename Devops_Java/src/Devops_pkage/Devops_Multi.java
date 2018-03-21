package Devops_pkage;

import junit.framework.TestCase;

public class Devops_Multi extends TestCase {
	public void test() {
		Devops_Class test = new Devops_Class();
		int result = test.Multiply(3,4);
		assertEquals(7, result);
	}

}
