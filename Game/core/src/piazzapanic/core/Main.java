package piazzapanic.core;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;

public class Main extends Game {
	public SpriteBatch batch;
	public static int width = 1600;
	public static int height = 1200;
	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingLeft = false;
	boolean movingRight = false;
	public MenuScreen menu;

	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		// Current screen takes control of rendering
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
