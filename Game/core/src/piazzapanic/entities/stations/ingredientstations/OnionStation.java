package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class OnionStation extends IngredientStationBase{

    public OnionStation(int layer) {
        super(layer);
    }

    @Override
    public IngredientBase getIngredientType() {
        return null;
        //return new Onion(this);
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/OnionStation.png";
    }

    @Override
    public String getName() {
        return "Onion Station";
    }
    
}
