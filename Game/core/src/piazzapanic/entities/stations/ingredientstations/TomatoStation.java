package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

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
