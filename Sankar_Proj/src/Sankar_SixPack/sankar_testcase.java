package Sankar_SixPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class sankar_testcase {

	@Test
	public void testConcatinate() {
		Sankar_class test = new Sankar_class();
				String result = test.concatenate ("5","0");
		
		assertEquals("Result", 0, result.concatenate("5", "0"));

		System.out.println(result);
			}

}
