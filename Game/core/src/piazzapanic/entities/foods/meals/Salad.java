package piazzapanic.entities.foods.meals;

import java.util.Stack;

import piazzapanic.entities.foods.ingredients.Lettuce;
import piazzapanic.entities.foods.ingredients.Onion;
import piazzapanic.entities.foods.ingredients.Tomato;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.dynamic.items.foods.MealBase;

public class Salad extends MealBase {

    @Override
    public String getName() {
        return "Salad";
    }

    public Salad() {
    }

    @Override
    public Stack<IngredientBase> getRecipe() {
        //define the ingredients and empty recipe
        Lettuce lettuce = new Lettuce();
        Onion onion = new Onion();
        Tomato tomato = new Tomato();
        Stack<IngredientBase> recipe = new Stack<>();

        //now the recipe steps
        lettuce.chop();
        recipe.add(lettuce);
        onion.chop();
        recipe.add(onion);
        tomato.chop();
        recipe.add(tomato);

        return recipe;
    }

}
