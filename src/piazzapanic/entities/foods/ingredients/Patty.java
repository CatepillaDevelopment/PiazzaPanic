package piazzapanic.entities.foods.ingredients;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.PreperationStationBase;

public class Patty extends IngredientBase {

    @Override
    public String getName() {
        return "Patty";
    }

    public Patty(PreperationStationBase spawnLocation) {
        super(spawnLocation);
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Patty.png";
    }

    @Override
    public boolean canBeChopped() {
        return true;
    }

    @Override
    public boolean canBeFried() {
        return false;
    }

    @Override
    public boolean canBeGrilled() {
        return true;
    }

    @Override
    public boolean canBeToasted() {
        return false;
    }

}
