package piazzapanic.entitiysystem.dynamic.characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.physics.box2d.*;

import piazzapanic.entitiysystem.dynamic.DynamicObjectBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.world.GameWorld;

import java.util.ArrayList;
import java.util.List;

public abstract class ChefBase extends DynamicObjectBase {

    protected float speed = 500000f;
    protected int w = 180, h = 200;
    protected float xval, yval;

    private List<IngredientBase> holding;

    public int getW() {
        return w;
    }


    public int getH() {
        return h;
    }

    @Override
    public Body getBody() {
        return body;
    }

    public abstract float getXval();


    public abstract float getYval();

    protected BodyDef bdef;
    protected PolygonShape shape;
    protected FixtureDef fdef;
    protected Body body;
    protected List<Fixture> fixtures;

    public ChefBase(int x, int y) {
        createDynamicObject(x, y);
        this.holding = new ArrayList <IngredientBase>();
    }

    public void createDynamicObject(int x, int y){
        this.bdef = new BodyDef();
        this.shape = new PolygonShape();
        this.fdef = new FixtureDef();
        this.fixtures = new ArrayList<>();


        //create chef objects
        bdef.type = BodyDef.BodyType.DynamicBody;
        bdef.position.set((x + getW() / 2), (y + getH() / 2));

        body = GameWorld.getTileMap().getWorld().createBody(bdef);

        shape.setAsBox(getW() / 2, getH() / 2);
        fdef.shape = shape;
        body.createFixture(fdef).setUserData(this);
        fixtures.add(body.createFixture(fdef));
}

    @Override
    protected List<FixtureDef> getFixtureDefs() {
        return null;
    }

    public void update(){
        checkUserInput();
    }


    private void checkUserInput(){
        float velX = 0, velY = 0;

        // Up
        if(Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP)){
            velY = 1;
        }
        // Down
        if(Gdx.input.isKeyPressed(Input.Keys.S) || Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            velY = -1;
        }
        // Right
        if(Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            velX = 1;
        }
        // Left
        if(Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            velX = -1;
        }

        //Move the body
        this.body.setLinearVelocity(velX * this.speed, velY * this.speed);
        this.xval = (int) this.body.getPosition().x;
        this.yval = (int) this.body.getPosition().y;
    }

    public void pickUp(IngredientBase food) {
        if (!isHolding(food)) {
            this.holding.add(food);
        }
    }

    public List<IngredientBase> getHolding() { return holding; }

    public boolean isHolding(IngredientBase food) {
        return this.holding.contains(food);
    }

}
