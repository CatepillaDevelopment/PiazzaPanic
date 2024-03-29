package piazzapanic.core;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.world.GameWorld;

public class GameScreen implements Screen{

    final Main game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private GameWorld gameWorld;
    private Sprite sprite;
    private GameHUD hud;

    public GameHUD getGameHud(){
        return this.hud;
    }

    public GameScreen(Main game){
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(Main.width, Main.height, gameCam);
        this.hud = new GameHUD(this.game.batch);

        // Create the world and lock the camera into the middle
        this.gameWorld = new GameWorld();
        gameCam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);

    }

    @Override
    public void show() {

    }

    public void update(float dt){
        GameWorld.getTileMap().getWorld().step(1/60f, 6, 2);

        //update the current chef
        this.gameWorld.getCurrentChef().update();
        this.hud.update(dt);

        // Only render what the gameCam can see
        gameCam.update();
        GameWorld.getTileMap().getRenderer().setView(gameCam);
    }

    @Override
    public void render(float delta) {
        //separate update logic from render
        update(delta);

        ScreenUtils.clear(0, 0, 0, 1);

        // Render the level
        GameWorld.getTileMap().getRenderer().render();
        // Render chefs
        this.game.batch.begin();
        this.chefRender();
        this.game.batch.end();
        // Switch chef
        if (Gdx.input.isKeyJustPressed(Input.Keys.E)) {
            gameWorld.getCurrentChef().getBody().setLinearVelocity(0,0);
            gameWorld.setCurrentChef(gameWorld.getCurrentChef() == gameWorld.getCharacters().get(1) ? 0 : 1);
        }
        // Make sure the chefs can't collide with eachother
        for(ChefBase chef : gameWorld.getCharacters()){
            if(chef.equals(gameWorld.getCurrentChef())){
                chef.getBody().setType(BodyDef.BodyType.DynamicBody);
            }
            else chef.getBody().setType(BodyDef.BodyType.StaticBody);
        }
        // Draw the HUD
        this.game.batch.setProjectionMatrix(this.hud.stage.getCamera().combined);
        this.hud.stage.draw();
    }

    public void chefRender() {
        // Render the sprites for each chef
        for (ChefBase chef : this.gameWorld.getCharacters()) {
            sprite = new Sprite(chef.getTexture());
            sprite.setSize(200,200);
            sprite.setPosition((chef.getXval() - 100), (chef.getYval() - 100));
            sprite.draw(game.batch);
            float xOfIngredient = (chef.getXval() - 100);
            for (ItemBase item : chef.getHolding()) {
                sprite = new Sprite(item.getTexture());
                sprite.setSize(50 ,50);
                sprite.setPosition(xOfIngredient , (chef.getYval() + 120));
                sprite.draw(game.batch);
                xOfIngredient += 50;
            }
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
