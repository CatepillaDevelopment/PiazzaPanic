package piazzapanic.entitiysystem.dynamic.characters.chefs;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.dynamic.characters.CharacterBase;

import java.util.List;

public abstract class ChefBase extends CharacterBase {

    protected float speed = 500f;

    public ChefBase() {
    }

    @Override
    protected List<FixtureDef> getFixtureDefs() {
        return null;
    }
}
