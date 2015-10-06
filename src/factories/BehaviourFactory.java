package factories;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

import Model.GameObject;
import behaviours.Behaviour;
import containers.MoveContainer;

public class BehaviourFactory {
	private static final Map<String, Behaviour> behaviours;
	private static final ServiceLoader<Behaviour> loader;
	
	static {
		behaviours = new HashMap<String, Behaviour>();
		loader = ServiceLoader.load(Behaviour.class);
		
		for (Behaviour behaviour : loader) {
			behaviours.put(behaviour.getClass().getSimpleName(), behaviour);
		}
	}
	
	public static final Behaviour create(final String name, GameObject go, MoveContainer mc) {
		if (behaviours.containsKey(name)) {
			return behaviours.get(name).copy(go, mc);
		}
		
		final String message = String.format("Command '%s' was not found, is the services file up to date?", name);
		throw new IllegalArgumentException(message);
	}
}
