package piazzapanic.entitiysystem.dynamic;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.EntityBase;

public abstract class DynamicObjectBase extends EntityBase {


    public DynamicObjectBase(TiledMap map, World world) {
        super(map, world);
    }
}
