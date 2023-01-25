package piazzapanic.entitiysystem.dynamic.characters;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.DynamicObjectBase;

public abstract class CharacterBase extends DynamicObjectBase {


    public CharacterBase(TiledMap map, World world) {
        super(map, world);
    }
}
