package piazzapanic.entitiysystem.dynamic.characters.chefs;

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

}
