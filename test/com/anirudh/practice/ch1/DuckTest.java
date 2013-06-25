package com.anirudh.practice.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuckTest {

	Duck duck;
	
	@Test
	public void testADuck() {
		duck = new ADuck();
		duck.swim();
		duck.fly();
		assertEquals("ADuck", duck.display());
	}

}
