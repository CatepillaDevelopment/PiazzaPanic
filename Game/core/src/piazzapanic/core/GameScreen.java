package piazzapanic.core;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import piazzapanic.world.GameWorld;

public class GameScreen implements Screen{

    final Main game;
    Texture texture;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private GameWorld gameWorld;
    public GameScreen(Main game){
        this.game = game;
        texture = new Texture("badlogic.jpg");
        gameCam = new OrthographicCamera();
        gamePort = new StretchViewport(this.game.width, this.game.height, gameCam);

        // Create the world and lock the camera into the middle
        this.gameWorld = new GameWorld();
        gameCam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);
    }

    @Override
    public void show() {

    }

    public void update(float dt){
        // Only render what the gameCam can see
        gameCam.update();
        gameWorld.getGameLevel().getRenderer().setView(gameCam);
    }

    @Override
    public void render(float delta) {
        update(delta);

        ScreenUtils.clear(0, 0, 0, 1);
        /*
        this.game.batch.setProjectionMatrix(gameCam.combined);
        this.game.batch.begin();
        this.game.batch.draw(texture, 0, 0);
        this.game.batch.end();
        */

        // Render the level
        gameWorld.getGameLevel().getRenderer().render();
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
