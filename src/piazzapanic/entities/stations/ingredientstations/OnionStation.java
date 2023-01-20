package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entities.foods.ingredients.Onion;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.IngredientStationBase;

public class OnionStation extends IngredientStationBase{

    @Override
    public IngredientBase getIngredientType() {
        return new Onion(this);
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
