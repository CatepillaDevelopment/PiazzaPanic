package piazzapanic.entities.stations.workstations;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;

import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.PreperationStationBase;
import com.badlogic.gdx.physics.box2d.*;

public class ChoppingStation extends PreperationStationBase {

    public ChoppingStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }



    @Override
    public String getName() {
        return "Chopping Station";
    }

    @Override
    public boolean processItem(ItemBase item) {
        if (item instanceof IngredientBase){
            IngredientBase ingredient = (IngredientBase) item;
            return ingredient.chop();
        }
        else {
            item.ruin();
            return false;
        }
    }

    @Override
    public int getProcessTime() {
        return 20;
    }

    @Override
    public int getPrecisionTime() {
        return 5;
    }

    @Override
    public void onHit(ChefBase chef) {

    }

}
