package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entities.foods.ingredients.Bun;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.IngredientStationBase;

public class BunStation extends IngredientStationBase{

    public BunStation(int layer, TiledMap map, World world) {
        super(layer, map, world);
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Bun(this);
        return null;
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/BunStation.png";
    }

    @Override
    public String getName() {
        return "Bun Station";
    }
    
}
