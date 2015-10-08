package factories;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ServiceLoader;

import levels.LevelBase;
import states.DuckState;
import Model.Duck;
import containers.HitContainer;
import Model.GameObject;
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
		if(ds == null) {
			return duckstates.get(1);
		}
		DuckState newds = duckstates.get(ds.getID() + 1);
		if (newds == null) {
			return duckstates.get(ds.getID());
		}
		return newds;
	}

	public static ArrayList<GameObject> getRandomDucks(int amountOfUnits, MoveContainer movec, HitContainer hitc) {
		// TODO Auto-generated method stub
		ArrayList<GameObject> objectList = new ArrayList<GameObject>();
		Dimension d = new Dimension(50,50);
		Point start = new Point();
		start.x = 0;
		start.y = 400;
		for (int i = 0; i < amountOfUnits; i++) {
			Random random = new Random();
			boolean green = random.nextBoolean();
			String type = "GreenDuck";
			int vecX = (int) (Math.random() * 50);
			int vecY = (int) -(Math.random() * 50);
			if (!green) {
				type = "RedDuck";
			}
			Point vector = new Point(vecX, vecY);
			Duck duck = create(type, d, vector, start, movec, hitc);
			objectList.add(duck);
		}
		return objectList;
	}

	public static DuckState changeState(DuckState ds) {
		// TODO Auto-generated method stub
		return getNextState(ds);
	}

}