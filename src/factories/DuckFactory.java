package factories;

import java.awt.Dimension;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

import Model.Duck;
import containers.MoveContainer;

public class DuckFactory {

	private static final Map<String, Duck> ducks;
	private static final ServiceLoader<Duck> loader;
	
	static {
		ducks = new HashMap<String, Duck>();
		loader = ServiceLoader.load(Duck.class);
		
		for (Duck duck : loader) {
			ducks.put(duck.getClass().getSimpleName(), duck);
		}
	}
	
	public static final Duck create(final String name, Dimension size, Point vector, Point coords, MoveContainer mc) {
		if (ducks.containsKey(name)) {
			return ducks.get(name).copy(size, vector, coords, mc);
		}
		
		final String message = String.format("Command '%s' was not found, is the services file up to date?", name);
		throw new IllegalArgumentException(message);
	}

}