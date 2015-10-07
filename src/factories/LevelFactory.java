package factories;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

import containers.HitContainer;
import containers.MoveContainer;
import levels.LevelBase;

public class LevelFactory {
	private static final Map<String, LevelBase> levels;
	private static final Map<Integer, LevelBase> levelMap;
	private static final ServiceLoader<LevelBase> loader;
	
	static {
		levels = new HashMap<String, LevelBase>();
		loader = ServiceLoader.load(LevelBase.class);
		levelMap = new HashMap<Integer, LevelBase>();
		
		for (LevelBase lvl : loader) {
			levels.put(lvl.getClass().getSimpleName(), lvl);
			levelMap.put(lvl.getID(), lvl);
		}
	}
	
	public static final LevelBase create(final String name, MoveContainer mc, HitContainer hc) {
		if (levels.containsKey(name)) {
			LevelBase lvl = levels.get(name).copy(mc, hc);
			return lvl;
		}
		
		final String message = String.format("Command '%s' was not found, is the services file up to date?", name);
		throw new IllegalArgumentException(message);
	}
	
	public static final LevelBase getNextLevel(final LevelBase currentLevel) {
		int lvlId = currentLevel.getID() + 1;
		Map<Integer, LevelBase> hm = levelMap;
		System.out.println(levelMap.toString());
		LevelBase nextLevel = levelMap.get(lvlId);
		return nextLevel;
	}
	
}
