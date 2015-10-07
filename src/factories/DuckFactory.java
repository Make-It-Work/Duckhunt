package factories;

import java.awt.Dimension;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

import levels.LevelBase;
import states.DuckState;
import Model.Duck;
import containers.HitContainer;
import containers.MoveContainer;

public class DuckFactory {

	private static final Map<String, Duck> ducks;
	private static final Map<Integer, DuckState> duckstates;
	private static final ServiceLoader<Duck> loader;
	private static final ServiceLoader<DuckState> stateloader;
	
	static {
		ducks = new HashMap<String, Duck>();
		loader = ServiceLoader.load(Duck.class);
		stateloader = ServiceLoader.load(DuckState.class);
		duckstates = new HashMap<Integer, DuckState>();

		for (DuckState ds : stateloader) {
			duckstates.put(ds.getID(), ds);
		}
		
		for (Duck duck : loader) {
			ducks.put(duck.getClass().getSimpleName(), duck);
		}
	}
	
	public static final Duck create(final String name, Dimension size, Point vector, Point coords, MoveContainer mc, HitContainer hc) {
		if (ducks.containsKey(name)) {
			return ducks.get(name).copy(size, vector, coords, mc, hc);
		}
		
		final String message = String.format("Command '%s' was not found, is the services file up to date?", name);
		throw new IllegalArgumentException(message);
	}
	
	public static DuckState setState(DuckState ds) {
		if (ds == null) {
			return duckstates.get(1);
		} else {
			return getNextState(ds);
		}
	}

	public static DuckState getNextState(DuckState ds) {
		// TODO Auto-generated method stub
		return duckstates.get(ds.getID() + 1);
	}

}