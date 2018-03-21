package Devops_pkage;

import junit.framework.TestCase;

public class Devops_test extends TestCase {

	public void testConcatinate() {
		Devops_Class test = new Devops_Class();
				String result = test.concatenate ("abc","efg");
		assertEquals ("abcefg",result);
			}
}
