package piazzapanic.entitiysystem.dynamic.items;

import piazzapanic.entitiysystem.dynamic.DynamicObjectBase;

public abstract class ItemBase extends DynamicObjectBase {
    protected boolean ruined;
    
    public ItemBase(){
        this.ruined = false;
    }

    public boolean isRuined(){
        return this.ruined;
    }

    public boolean ruin(){
        if (this.ruined == false){
            this.ruined = true;
            return true;
        }
        else {
            return false;
        }
    }
}
