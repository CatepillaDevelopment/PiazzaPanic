package piazzapanic.entities.foods.meals;

import java.util.Stack;

import piazzapanic.entities.foods.ingredients.Bun;
import piazzapanic.entities.foods.ingredients.Patty;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.dynamic.items.foods.MealBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.PreperationStationBase;

public class Burger extends MealBase {

    @Override
    public String getName() {
        return "Burger";
    }

    public Burger(PreperationStationBase spawnLocation) {
        super(spawnLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Burger.png";
    }

    @Override
    public Stack<IngredientBase> getRecipe() {
        //define the ingredients and empty recipe
        Bun bun = new Bun(null);
        Patty patty = new Patty(null);
        Bun bun2 = new Bun(null);
        Stack<IngredientBase> recipe = new Stack<>();

        //now the recipe steps
        bun.chop();
        bun.toast();
        recipe.add(bun);
        patty.chop();
        patty.grill();
        recipe.add(patty);
        bun.chop();
        bun.toast();
        recipe.add(bun2);

        return recipe;
    }

}
