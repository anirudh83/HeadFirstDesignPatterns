package com.anirudh.practice.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

import com.anirudh.practice.strategy.ADuck;
import com.anirudh.practice.strategy.Duck;

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
