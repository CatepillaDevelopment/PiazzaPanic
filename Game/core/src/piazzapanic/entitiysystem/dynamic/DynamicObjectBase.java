package piazzapanic.entitiysystem.dynamic;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.EntityBase;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.world.GameWorld;

public abstract class DynamicObjectBase extends EntityBase {

    public DynamicObjectBase() {
    }


    @Override
    protected BodyDef getBodyDef() {
        BodyDef bodyDef = new BodyDef();
        return bodyDef;
    }
}
