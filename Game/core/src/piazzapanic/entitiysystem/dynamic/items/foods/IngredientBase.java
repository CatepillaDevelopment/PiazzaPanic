package piazzapanic.entitiysystem.dynamic.items.foods;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public abstract class IngredientBase extends ItemBase {
    protected boolean chopped;
    protected boolean fried;
    protected boolean grilled;
    protected boolean toasted;
    protected MealBase inMeal;

    public IngredientBase(FixedObjectBase spawnLocation) {
        super(spawnLocation);
        this.chopped = false;
        this.fried = false;
        this.grilled = false;
        this.toasted = false;
        //TODO Auto-generated constructor stub
    }

    public abstract boolean canBeChopped();
    public abstract boolean canBeFried();
    public abstract boolean canBeGrilled();
    public abstract boolean canBeToasted();

    public boolean isChopped(){
        return this.chopped;
    }
    public boolean isFried(){
        return this.fried;
    }
    public boolean isGrilled(){
        return this.grilled;
    }
    public boolean isToasted(){
        return this.toasted;
    }
    public boolean isInMeal(){
        return (!(this.inMeal == null));
    }

    //this code doesn't take into account that items may need to be prepared differently for different meals
    //the meal class should determine if ingredients are prepared according to the recipe
/*     public boolean isPrepared(){
        if (this.isRuined() == false){
            if (this.isChopped() == this.canBeChopped() && 
                this.isFried() == this.canBeFried() &&
                this.isGrilled() == this.canBeGrilled() &&
                this.isToasted() == this.canBeToasted()){
                    return true;
            }
        }
        return false;
    } */

    public boolean chop(){
        if ((this.chopped = false) && (this.canBeChopped())){
            this.chopped = true;
            return true;
        } else{
            this.chopped = true;
            this.ruin();
            return false;
        }
    }
    public boolean fry(){
        if ((this.fried = false) && (this.canBeFried())){
            this.fried = true;
            return true;
        } else{
            this.fried = true;
            this.ruin();
            return false;
        }
    }
    public boolean grill(){
        if ((this.grilled = false) && (this.canBeGrilled())){
            this.grilled = true;
            return true;
        } else{
            this.grilled = true;
            this.ruin();
            return false;
        }
    }
    public boolean toast(){
        if ((this.toasted = false) && (this.canBeToasted())){
            this.toasted = true;
            return true;
        } else{
            this.toasted = true;
            this.ruin();
            return false;
        }
    }
    public boolean setInMeal(MealBase meal){
        if (!(this.isInMeal())){
            this.inMeal = meal;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object object){
        if (this.getClass() == object.getClass()){
            if (object instanceof IngredientBase){
                IngredientBase ingredient = (IngredientBase) object;
                if (this.isChopped() == ingredient.isChopped() &&
                    this.isFried() == ingredient.isFried() &&
                    this.isGrilled() == ingredient.isGrilled() &&
                    this.isToasted() == ingredient.isToasted()){
                        return true;
                    }
            }
        }
        return false;
    }
    
}
