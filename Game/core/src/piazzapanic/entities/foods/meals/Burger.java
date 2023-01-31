package piazzapanic.entities.foods.meals;

import java.util.Stack;

import piazzapanic.entities.foods.ingredients.Bun;
import piazzapanic.entities.foods.ingredients.Patty;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.dynamic.items.foods.MealBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.PreperationStationBase;

public class Burger extends MealBase {

    @Override
    public String getName() {
        return "Burger";
    }

    public Burger(/*PreperationStationBase spawnLocation*/) {
//        super(spawnLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Stack<IngredientBase> getRecipe() {
        //define the ingredients and empty recipe
        Bun bun = new Bun();
        Patty patty = new Patty();
        Bun bun2 = new Bun();
        Stack<IngredientBase> recipe = new Stack<>();

        //now the recipe steps
        bun.chop();
        bun.toast();
        recipe.add(bun);
        patty.chop();
        patty.grill();
        recipe.add(patty);
        bun2.chop();
        bun2.toast();
        recipe.add(bun2);

        return recipe;
    }
}