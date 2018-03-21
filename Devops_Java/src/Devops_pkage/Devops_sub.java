package Devops_pkage;

import junit.framework.TestCase;

public class Devops_sub extends TestCase {
	public void test() {
		Devops_Class test = new Devops_Class();
		int result = test.subtract1(9,4);
		assertEquals(5, result);
		System.out.println(result);
}
}