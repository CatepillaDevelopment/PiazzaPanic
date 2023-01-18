package piazzapanic.entities.foods.meals;

import java.util.Stack;

import piazzapanic.entities.foods.ingredients.Buns;
import piazzapanic.entities.foods.ingredients.Patty;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
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

    @Override
    public Stack<IngredientBase> getRecipe() {
        //define the ingredients and empty recipe
        Buns bun = new Buns(null);
        Patty patty = new Patty(null);
        Buns bun2 = new Buns(null);
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
