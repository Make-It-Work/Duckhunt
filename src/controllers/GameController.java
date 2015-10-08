package controllers;

import java.util.ArrayList;
import java.util.Date;

import Model.GameObject;
import View.GameView;
import containers.HitContainer;
import containers.InputContainer;
import containers.MoveContainer;
import factories.LevelFactory;
import levels.LevelBase;

public class GameController {
	
	public static void main(String[] args)
	{
		new GameController();
	}
	
	//variables
	boolean playing = true;
	
	//containers
	InputContainer input = new InputContainer();
	MoveContainer movec = new MoveContainer();
	HitContainer hitc = new HitContainer(input);
	
	//models
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	//views
	GameView gui;
	
	Thread guiThread;
	
	private LevelBase startLevel;
	
	public GameController()
	{
		try {
			startLevel = LevelFactory.create("FirstLevel", movec, hitc);
			startLevel.handle();
			objects = startLevel.getObjects();
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		guiThread = new Thread(gui = new GameView(input, objects));
		guiThread.start();
		loop();
	}
	
	private void loop()
	{
		long dt = 0;
		long timestamp = new Date().getTime();
		while(playing) {
			//Read input
			//Move objects
			hitc.Run(dt);
			movec.Run(dt);
			if(movec.isEmpty()) {
				startLevel = startLevel.nextLevel(startLevel);
				if (startLevel == null) {
					System.exit(0);
				} else {
					startLevel.handle();
					objects = startLevel.getObjects();
					guiThread = new Thread(gui = new GameView(input, objects));
					guiThread.start();
				}
			};
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				
			}
			//System.out.println(dt);
			long newTime = new Date().getTime();
			dt = newTime - timestamp;
			timestamp = newTime;
		}
	}
}