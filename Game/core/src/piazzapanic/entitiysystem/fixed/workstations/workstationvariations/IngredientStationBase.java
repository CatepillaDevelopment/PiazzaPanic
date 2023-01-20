package piazzapanic.entitiysystem.fixed.workstations.workstationvariations;

import java.util.ArrayList;
import java.util.List;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

public abstract class IngredientStationBase extends WorkstationBase {
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