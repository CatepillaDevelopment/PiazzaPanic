package piazzapanic.entitiysystem.dynamic.items.foods;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public abstract class MealBase extends ItemBase {
    protected Stack<IngredientBase> stepsLeftToComplete;
    protected List<IngredientBase> contents;

    public MealBase(FixedObjectBase spawnLocation) {
        super(spawnLocation);
        this.contents = null;
        this.stepsLeftToComplete = this.getRecipe();
    }

    public abstract Stack<IngredientBase> getRecipe();

    public List<IngredientBase> getStepsLeftToComplete() {
        return new ArrayList<IngredientBase>(this.getStepsLeftToComplete());
    }
    public List<IngredientBase> getContents() {
        return this.contents;
    }

    public boolean add(IngredientBase ingredient){
        if (ingredient.isInMeal()){
            return false;
        }
        ingredient.setHolder(null);
        ingredient.setPlacedOn(null);
        ingredient.setInMeal(this);

        this.contents.add(ingredient);

        IngredientBase nextStep = this.stepsLeftToComplete.peek();
        if (ingredient.equals(nextStep)){
            this.stepsLeftToComplete.pop();
            return true;
        } else{
            this.ruin();
            return false;
        }
    }

    public boolean isPrepared(){
        if (this.contents.equals(this.getRecipe())){
            return true;
        }
        return false;
    }

}
