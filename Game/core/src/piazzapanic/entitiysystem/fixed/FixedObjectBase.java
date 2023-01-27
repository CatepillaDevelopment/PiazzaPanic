package piazzapanic.entitiysystem.fixed;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import piazzapanic.entitiysystem.EntityBase;

public abstract class FixedObjectBase extends EntityBase {

    //layer defines the object layer
    public FixedObjectBase(int layer){
    }

    @Override
    protected BodyDef getBodyDef(){
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(0, 0);
        bodyDef.type = BodyDef.BodyType.StaticBody;

        return bodyDef;
    }
}
