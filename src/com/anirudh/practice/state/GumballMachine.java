/**
 * 
 */
package com.anirudh.practice.state;

/**
 * @author <a href="http://anirudhbhatnagar.com">Anirudh Bhatnagar</a>
 *
 */
public class GumballMachine {
	
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	
	public GumballMachine(int count) {
		this.count=count;
		}
	
	public void insertCoin(){
		if(state==SOLD_OUT){
			
		}
		
	}
	
	public void dispatchGumball(){
		
	}
	
	public void ejectQuarter(){
		
	}
	
	public void turnCrank(){
		
	}
	
	
	
	

}
