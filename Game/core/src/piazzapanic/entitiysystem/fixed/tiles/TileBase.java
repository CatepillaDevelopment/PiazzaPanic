package piazzapanic.entitiysystem.fixed.tiles;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public abstract class TileBase extends FixedObjectBase {

    public TileBase(int layer, TiledMap map, World world) {
        super(layer, map, world);
    }
}
