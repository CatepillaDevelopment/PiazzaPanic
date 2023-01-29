package piazzapanic.core;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import piazzapanic.entities.chefs.ChefAlex;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.world.GameWorld;

public class GameScreen implements Screen{

    final Main game;
    private Box2DDebugRenderer box2DDebugRenderer;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private GameWorld gameWorld;
    private Sprite sprite;
    private GameHUD hud;
    public GameScreen(Main game){
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(this.game.width, this.game.height, gameCam);
        this.box2DDebugRenderer = new Box2DDebugRenderer();
        this.hud = new GameHUD(this.game.batch);

        // Create the world and lock the camera into the middle
        this.gameWorld = new GameWorld();
        gameCam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);

    }

    @Override
    public void show() {

    }

    public void update(float dt){
        this.gameWorld.getTileMap().getWorld().step(1/60f, 6, 2);

        //update the current chef
        this.gameWorld.getCurrentChef().update();
        this.hud.update(dt);

        // Only render what the gameCam can see
        gameCam.update();
        gameWorld.getTileMap().getRenderer().setView(gameCam);
    }

    @Override
    public void render(float delta) {
        //separate update logic from render
        update(delta);

        ScreenUtils.clear(0, 0, 0, 1);

        // Render the level
        gameWorld.getTileMap().getRenderer().render();
        //render Box2DDebugLines
        box2DDebugRenderer.render(gameWorld.getTileMap().getWorld(), gameCam.combined);
        this.game.batch.begin();
        for (ChefBase chef : this.gameWorld.getCharacters()) {
            sprite = new Sprite(chef.getTexture());
            sprite.setSize(200,200);
            sprite.setPosition(chef.getXval() - 100, chef.getYval() - 100);
            sprite.draw(game.batch);
        }
        this.game.batch.end();

        // Draw the HUD
        this.game.batch.setProjectionMatrix(this.hud.stage.getCamera().combined);
        this.hud.stage.draw();
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
