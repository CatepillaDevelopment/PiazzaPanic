package piazzapanic.entitiysystem.fixed.workstations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public abstract class PreperationStationBase extends FixedObjectBase {
    protected Map<ItemBase, Integer> contents; 

    public PreperationStationBase(){
        contents = new HashMap<>();
    }

    public abstract boolean processItem(ItemBase item);
    public abstract int getProcessTime();
    public abstract int getPrecisionTime();

    public void tick(){
        for (Map.Entry<ItemBase,Integer> entry : this.contents.entrySet()) {
            ItemBase item = entry.getKey();
            Integer timeToCompleteion = entry.getValue();
            timeToCompleteion += -1;
            if (timeToCompleteion < 0-this.getPrecisionTime()){
                item.ruin();
            }
        }
    }

    public void placeItem(ItemBase item){
        this.contents.put(item, this.getProcessTime());
    }

    public boolean removeItem(ItemBase item){
        Integer timeRemaining = this.contents.remove(item);
        if (timeRemaining == null){
            return false;
        }
        if (timeRemaining < 0){
            this.processItem(item);
        }
        return true;
    }

    public Integer getTimeRemaining(ItemBase item){
        return this.contents.get(item);
    }

    public Set<ItemBase> getContents(){
        return contents.keySet();
    }


}
