package piazzapanic.entities.foods.meals;

import piazzapanic.entitiysystem.dynamic.items.foods.MealBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

public class Salad extends MealBase {

    public Salad(WorkstationBase spawnLocation) {
        super(spawnLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Salad.png";
    }

}
