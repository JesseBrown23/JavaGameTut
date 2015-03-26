package my.tdl.gameloop;

import java.awt.Component;

import my.project.gop.main.JBGameLoop;
import my.tdl.gamestate.GameStateManager;

public class GameLoop extends JBGameLoop {
	
	GameStateManager gsm;
	
	public GameLoop(int fwidth, int fheight) {
		super(fwidth, fheight);
	}
	
	@Override
	public void init() {
		gsm = new GameStateManager();
		gsm.init();
		super.init();
	}
	
	@Override
	public void tick(double deltaTime) {
		gsm.tick(deltaTime);
	}
	
	@Override
	public void render() {
		super.render();
		gsm.render(graphics2D);
		clear();
	}
	
	@Override
	public void clear() {
		super.clear();
	}
}
