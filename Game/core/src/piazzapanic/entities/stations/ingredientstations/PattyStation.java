package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entities.foods.ingredients.Patty;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.IngredientStationBase;

public class PattyStation extends IngredientStationBase{

    public PattyStation(int layer) {
        super(layer);
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Patty(this);
        return null;
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/PattyStation.png";
    }

    @Override
    public String getName() {
        return "Patty Station";
    }
    
}
