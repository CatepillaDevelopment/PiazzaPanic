package piazzapanic.entities.stations.ingredientstations;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class BunStation extends IngredientStationBase{

    public BunStation(int layer) {
        super(layer);
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Bun(this);
        return null;
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
