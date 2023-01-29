package piazzapanic.entitiysystem.dynamic.characters.chefs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.dynamic.characters.CharacterBase;
import piazzapanic.world.GameWorld;

import java.util.List;

public abstract class ChefBase extends CharacterBase {

    protected float speed = 500f;
    protected int w = 200, h = 200;
    protected int xval, yval;


    public int getW() {
        return w;
    }


    public int getH() {
        return h;
    }


    public abstract int getXval();


    public abstract int getYval();

    protected BodyDef bdef;
    protected PolygonShape shape;
    protected FixtureDef fdef;
    protected Body body;

    public ChefBase() {
        createDynamicObject();
        System.out.println(this.getXval());
    }

    public void createDynamicObject(){
        bdef = new BodyDef();
        shape = new PolygonShape();
        fdef = new FixtureDef();


        //create chef objects
        bdef.type = BodyDef.BodyType.DynamicBody;
        bdef.position.set(getXval() + getW() / 2, getYval() + getH() / 2);

        body = GameWorld.getTileMap().getWorld().createBody(bdef);

        shape.setAsBox(getW() / 2, getH() / 2);
        fdef.shape = shape;
        body.createFixture(fdef).setUserData("chef");

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
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            velY = 1;
        }
        // Down
        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            velY = -1;
        }
        // Right
        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            velX = 1;
        }
        // Left
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            velX = -1;
        }

        //Move the body
        this.body.setLinearVelocity(velX * this.speed, velY * this.speed);
        this.xval = (int) this.body.getPosition().x;
        this.yval = (int) this.body.getPosition().y;
    }

}
