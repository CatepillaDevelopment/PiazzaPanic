package piazzapanic.entities.foods.ingredients;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public class Bun extends IngredientBase {

    @Override
    public String getName() {
        return "Bun";
    }

    public Bun(FixedObjectBase spawnLocation) {
        super(spawnLocation);
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Bun.png";
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
        return false;
    }

    @Override
    public boolean canBeToasted() {
        return true;
    }

}
