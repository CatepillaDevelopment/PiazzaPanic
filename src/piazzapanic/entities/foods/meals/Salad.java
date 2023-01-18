package piazzapanic.entities.foods.meals;

import java.util.Stack;

import piazzapanic.entities.foods.ingredients.Lettuce;
import piazzapanic.entities.foods.ingredients.Onion;
import piazzapanic.entities.foods.ingredients.Tomato;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.dynamic.items.foods.MealBase;
import piazzapanic.entitiysystem.fixed.workstations.PreperationStationBase;

public class Salad extends MealBase {

    public Salad(PreperationStationBase spawnLocation) {
        super(spawnLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Salad.png";
    }

    @Override
    public Stack<IngredientBase> getRecipe() {
        //define the ingredients and empty recipe
        Lettuce lettuce = new Lettuce(null);
        Onion onion = new Onion(null);
        Tomato tomato = new Tomato(null);
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
