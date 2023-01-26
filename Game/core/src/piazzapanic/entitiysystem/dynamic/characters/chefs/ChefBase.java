package piazzapanic.entitiysystem.dynamic.characters.chefs;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.dynamic.characters.CharacterBase;

public abstract class ChefBase extends CharacterBase {

    protected float speed = 500f;

    public ChefBase(TiledMap map, World world) {
        super(map, world);
    }

    public void update(){};


}
