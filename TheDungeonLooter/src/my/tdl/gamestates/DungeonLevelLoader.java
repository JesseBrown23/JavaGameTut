package my.tdl.gamestates;

import java.awt.Graphics2D;

import my.tdl.gamestate.GameState;
import my.tdl.gamestate.GameStateManager;

public class DungeonLevelLoader extends GameState{
	
	public DungeonLevelLoader(GameStateManager gsm){
		super(gsm);
	}

	@Override
	public void init() {
	}

	@Override
	public void tick(double deltaTime) {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("Hello World!", 200, 200);
	}
}
