package piazzapanic.entities.foods.ingredients;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.PreperationStationBase;

public class Tomato extends IngredientBase {

    @Override
    public String getName() {
        return "Tomato";
    }

    public Tomato(PreperationStationBase spawnLocation) {
        super(spawnLocation);
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Tomato.png";
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
