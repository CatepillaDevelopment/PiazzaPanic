package piazzapanic.entitiysystem.dynamic.characters.chefs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.dynamic.characters.CharacterBase;

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


    public int getXval() {
        return xval;
    }


    public int getYval() {
        return yval;
    }

    public ChefBase() {

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
    }

}
