package piazzapanic.entitiysystem.dynamic.items;

import com.badlogic.gdx.physics.box2d.FixtureDef;
import piazzapanic.entitiysystem.dynamic.DynamicObjectBase;
import piazzapanic.entitiysystem.dynamic.characters.CharacterBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.PreperationStationBase;

import java.util.List;

public abstract class ItemBase extends DynamicObjectBase {
    protected boolean ruined;
    protected CharacterBase heldBy;
    protected FixedObjectBase placedOn;
    
    public ItemBase(FixedObjectBase spawnLocation){
        super();
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

    public FixedObjectBase getPlacedOn(){
        return this.placedOn;
    }

    public void setPlacedOn(PreperationStationBase workstation){
        this.placedOn = workstation;
    }

    @Override
    protected List<FixtureDef> getFixtureDefs() {
        return null;
    }
}
