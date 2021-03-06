package my.tdl.gamestates;

import java.awt.Graphics2D;

import my.project.gop.main.SpriteSheet;
import my.project.gop.main.loadImageFrom;
import my.tdl.gamestate.GameState;
import my.tdl.gamestate.GameStateManager;
import my.tdl.main.Main;

public class DungeonLevelLoader extends GameState{
	
	SpriteSheet test = new SpriteSheet();
	
	public DungeonLevelLoader(GameStateManager gsm){
		super(gsm);
	}

	@Override
	public void init() {
		test.setSpriteSheet(loadImageFrom.LoadImageFrom(Main.class, "spritesheet.png"));
	}

	@Override
	public void tick(double deltaTime) {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("Hello World!", 200, 200);
		g.drawImage(test.getTile(0, 0, 16, 16), 0 , 0, 64, 64, null);
	}
}
