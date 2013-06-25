package com.anirudh.practice.callback;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author anirudh
 * Hollywood director maintains the list of callbacks (telephone numbers)
 *  of all the struggling actors.
 */

public class HollywoodDirector {
	
	List<StrugglingActorCallback> strugglingActorCallbacks = new ArrayList<StrugglingActorCallback>();
	
	public void registerActorCallbacks(StrugglingActorCallback callback){
		strugglingActorCallbacks.add(callback);
	}

	public void callStruglingActors(){
		for (StrugglingActorCallback callback : strugglingActorCallbacks) {
			callback.callbackMethodFromDirector();
		}
	}
	
}
