package piazzapanic.entitiysystem;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import java.util.List;

public abstract class EntityBase extends Sprite {
    protected String name;
    public abstract String getName();

    protected abstract BodyDef getBodyDef();
    protected abstract List<FixtureDef> getFixtureDefs();


    // Ben's stuff
    // public because code was buggin
    public Body body;

    public EntityBase(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getBody() {
        return this.body;
    }
}