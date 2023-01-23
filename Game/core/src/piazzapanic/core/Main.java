package piazzapanic.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;

public class Main extends Game {
	public SpriteBatch batch;
	public int width = 1536;
	public int height = 864;
	
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
