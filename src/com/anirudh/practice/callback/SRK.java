package com.anirudh.practice.callback;


/**
 * 
 * @author anirudh
 *if SRK wants to apply to Hollywood director 
 *he has to register his callback which implements StrugglingActorCallback
 *
 */
public class SRK {

	public void applyForHollyWoodMovie(HollywoodDirector hollywoodDirector){
		hollywoodDirector.registerActorCallbacks(new StrugglingActorCallback() {
			
			@Override
			public void callbackMethodFromDirector() {
				System.out.println("Shahrukh to be called at number at +91-9483948234");
			}
		});
	}

}
