package com.tomtom.amelinium.confluence;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfluenceConfigTest {

	@Test
	public void test() {
		// given
		System.setProperty("amelinium.config", "src/test/resources/config_test.properties");
		ConfluenceConfig config = new ConfluenceConfig();
		
		// then
		assertEquals("aaa",config.USER);
		assertEquals("bbb",config.PASS);
		assertEquals("ccc",config.SERVER);
	}

}
