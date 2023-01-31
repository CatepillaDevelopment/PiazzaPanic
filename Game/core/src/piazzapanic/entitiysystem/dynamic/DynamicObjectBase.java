package piazzapanic.entitiysystem.dynamic;

import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.EntityBase;

public abstract class DynamicObjectBase extends EntityBase {

    public DynamicObjectBase() {
    }


    @Override
    protected BodyDef getBodyDef() {
        BodyDef bodyDef = new BodyDef();
        return bodyDef;
    }
}
