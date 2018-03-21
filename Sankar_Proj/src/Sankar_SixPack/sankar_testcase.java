package Sankar_SixPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class sankar_testcase {

	@Test
	public void testConcatinate() {
		Sankar_class test = new Sankar_class();
				String result = test.concatenate ("aaaaa","efg");
		assertEquals ("aaaaaefg",result);
		

		System.out.println(result);
			}

}

