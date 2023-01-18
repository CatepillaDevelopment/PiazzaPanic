package piazzapanic.entities.foods.ingredients;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

public class Buns extends IngredientBase {

    public Buns(WorkstationBase spawnLocation) {
        super(spawnLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Buns.png";
    }

    @Override
    public boolean canBeChopped() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean canBeFried() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canBeGrilled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canBeToasted() {
        // TODO Auto-generated method stub
        return true;
    }

}
