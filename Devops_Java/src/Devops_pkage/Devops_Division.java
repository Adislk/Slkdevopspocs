package Devops_pkage;

import junit.framework.TestCase;

public class Devops_Division extends TestCase {
	public void test() {
		Devops_Class test = new Devops_Class();
		int result = test.Div(10,5);
		assertEquals(3, result);
		System.out.println(result);
	}
}
