package piazzapanic.entities.chefs;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefSteve extends ChefBase{

    public ChefSteve(TiledMap map, World world) {
        super(map, world);
    }

    @Override
    public String getName() {
        return "Steve";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefSteve.png";
    }

}
