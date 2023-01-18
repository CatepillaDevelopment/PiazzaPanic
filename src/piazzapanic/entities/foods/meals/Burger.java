package piazzapanic.entities.foods.meals;

import piazzapanic.entitiysystem.dynamic.items.foods.MealBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

public class Burger extends MealBase {

    public Burger(WorkstationBase spawnLocation) {
        super(spawnLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Burger.png";
    }

}
