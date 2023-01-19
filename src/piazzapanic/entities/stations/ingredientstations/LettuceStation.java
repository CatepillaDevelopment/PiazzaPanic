package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entities.foods.ingredients.Lettuce;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.IngredientStationBase;

public class LettuceStation extends IngredientStationBase{

    @Override
    public IngredientBase getIngredientType() {
        return new Lettuce(this);
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
