package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entities.foods.ingredients.Tomato;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.IngredientStationBase;

public class TomatoStation extends IngredientStationBase{

    @Override
    public IngredientBase getIngredientType() {
        return new Tomato(this);
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
