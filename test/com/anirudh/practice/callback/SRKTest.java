package com.anirudh.practice.callback;

import org.junit.Test;

import com.anirudh.practice.callback.HollywoodDirector;
import com.anirudh.practice.callback.SRK;

/**
 * 
 * @author anirudh
 *
 */
public class SRKTest {

	@Test
	public void test() {
		SRK srk = new SRK();
		HollywoodDirector director = new HollywoodDirector();
		srk.applyForHollyWoodMovie(director);
		//now this is directors choice when to call the struglling actors.
		director.callStruglingActors();
	}

}
