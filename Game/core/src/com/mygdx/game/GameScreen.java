package com.mygdx.game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameScreen implements Screen{

    final Main game;
    Texture texture;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    public GameScreen(Main game){
        this.game = game;
        texture = new Texture("badlogic.jpg");
        gameCam = new OrthographicCamera();
        gamePort = new StretchViewport(800, 400, gameCam);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0, 1);
        this.game.batch.setProjectionMatrix(gameCam.combined);
        this.game.batch.begin();
        this.game.batch.draw(texture, 0, 0);
        this.game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
