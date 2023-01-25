package piazzapanic.entities.chefs;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefAlex extends ChefBase{

    public ChefAlex(TiledMap map, World world) {
        super(map, world);
    }

    @Override
    public String getName() {
        return "Alex";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefAlex.png";
    }

}
