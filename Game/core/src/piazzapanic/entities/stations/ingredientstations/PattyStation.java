package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entities.foods.ingredients.Patty;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.IngredientStationBase;

public class PattyStation extends IngredientStationBase{

    @Override
    public IngredientBase getIngredientType() {
        return new Patty(this);
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
