package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class LettuceStation extends IngredientStationBase{

    public LettuceStation(int layer) {
        super(layer);
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Lettuce(this);
        return null;
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/LettuceStation.png";
    }

    @Override
    public String getName() {
        return "Lettuce Station";
    }
    
}
