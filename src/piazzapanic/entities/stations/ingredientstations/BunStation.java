package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entities.foods.ingredients.Bun;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.IngredientStationBase;

public class BunStation extends IngredientStationBase{

    @Override
    public IngredientBase getIngredientType() {
        return new Bun(this);
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
