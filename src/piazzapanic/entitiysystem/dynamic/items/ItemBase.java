package piazzapanic.entitiysystem.dynamic.items;

import piazzapanic.entitiysystem.dynamic.DynamicObjectBase;
import piazzapanic.entitiysystem.dynamic.characters.CharacterBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

public abstract class ItemBase extends DynamicObjectBase {
    protected boolean ruined;
    protected CharacterBase heldBy;
    protected WorkstationBase placedOn;
    
    public ItemBase(WorkstationBase spawnLocation){
        this.ruined = false;
        this.heldBy = null;
        this.placedOn = spawnLocation;
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

    public boolean isHeld(){
        return (this.heldBy != null);
    }

    public CharacterBase getHolder(){
        return this.heldBy;
    }

    public void setHolder(CharacterBase character){
        this.heldBy = character;
    }

    public boolean isPlaced(){
        return (this.placedOn != null);
    }

    public WorkstationBase getPlacedOn(){
        return this.placedOn;
    }

    public void setPlacedOn(WorkstationBase workstation){
        this.placedOn = workstation;
    }
}
