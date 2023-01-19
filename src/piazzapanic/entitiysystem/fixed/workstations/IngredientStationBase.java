package piazzapanic.entitiysystem.fixed.workstations;

import java.util.ArrayList;
import java.util.List;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public abstract class IngredientStationBase extends FixedObjectBase{
    protected List<IngredientBase> contents;

    public abstract IngredientBase getIngredientType();

    public IngredientStationBase(){
        this.contents = new ArrayList<>(4);
        this.contents.add(this.getIngredientType());
        this.contents.add(this.getIngredientType());
        this.contents.add(this.getIngredientType());
        this.contents.add(this.getIngredientType());

    }

    public void tick(){
        while(this.contents.size() < 4){
            this.contents.add(this.getIngredientType());
        }
    }
}
