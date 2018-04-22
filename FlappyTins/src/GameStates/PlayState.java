package GameStates;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import Entities.TinCan;
import flappytin.GameLauncher;
import flappytin.ResourceLoader;

public class PlayState extends GameState{
	
	private TinCan tinCan;

	public PlayState(GameStateManager gsm) {
		super(gsm);
		
	}

	@Override
	public void init() {
		tinCan = new TinCan();
		tinCan.setState(0);
		tinCan.setPosition(GameLauncher.WIDTH/2, GameLauncher.HEIGHT/2 - tinCan.getHeight()/2);
		System.out.println(GameLauncher.WIDTH);
		System.out.println((GameLauncher.WIDTH/2 - tinCan.getWidth()/2) +", "+ (GameLauncher.HEIGHT/2 - tinCan.getHeight()/2));
		initialized = true;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage((Image) ResourceLoader.LOADED_ASSETS.get("flappymenubg.png"), 0, 0, null);
		tinCan.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
