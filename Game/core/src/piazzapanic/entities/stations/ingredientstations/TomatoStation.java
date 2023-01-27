package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entities.foods.ingredients.Tomato;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.IngredientStationBase;

public class TomatoStation extends IngredientStationBase{

    public TomatoStation(int layer) {
        super(layer);
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Tomato(this);
        return null;
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/TomatoStation.png";
    }

    @Override
    public String getName() {
        return "Tomato Station";
    }
    
}
