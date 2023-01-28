package piazzapanic.core;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
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
    public GameScreen(Main game){
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(this.game.width, this.game.height, gameCam);
        this.box2DDebugRenderer = new Box2DDebugRenderer();

        // Create the world and lock the camera into the middle
        this.gameWorld = new GameWorld();
        gameCam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);

        createObjects();
    }

    @Override
    public void show() {

    }

    public void update(float dt){
        this.gameWorld.getTileMap().getWorld().step(1/60f, 6, 2);

        //update the current chef
        this.gameWorld.getCurrentChef().update();

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
    }
    public void createObjects(){

        BodyDef bdef = new BodyDef();
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();
        Body body;

        // Create static map objects
        for(int i = 2; i < 5; i++) {
            for (MapObject object : GameWorld.getTileMap().getMap().getLayers().get(i).getObjects().getByType(RectangleMapObject.class)) {
                Rectangle rect = ((RectangleMapObject) object).getRectangle();

                bdef.type = BodyDef.BodyType.StaticBody;
                bdef.position.set(rect.getX() + rect.getWidth() / 2, rect.getY() + rect.getHeight() / 2);

                body = GameWorld.getTileMap().getWorld().createBody(bdef);

                shape.setAsBox(rect.getWidth() / 2, rect.getHeight() / 2);
                fdef.shape = shape;
                body.createFixture(fdef);
            }
        }

        //create chef objects
        for (ChefBase chef : this.gameWorld.getCharacters()){
            bdef.type = BodyDef.BodyType.DynamicBody;
            bdef.position.set(chef.getXval() + chef.getW() / 2, chef.getYval() + chef.getH() / 2);

            chef.body = GameWorld.getTileMap().getWorld().createBody(bdef);

            shape.setAsBox(chef.getW() / 2, chef.getH() / 2);
            fdef.shape = shape;
            chef.body.createFixture(fdef);
        }

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
