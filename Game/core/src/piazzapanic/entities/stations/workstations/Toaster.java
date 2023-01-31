package piazzapanic.entities.stations.workstations;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.PreperationStationBase;
import piazzapanic.world.GameWorld;

public class Toaster extends PreperationStationBase {

    public Toaster(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }



    @Override
    public String getName() {
        return "Toaster";
    }

    @Override
    public boolean processItem(ItemBase item) {
        if (item instanceof IngredientBase){
            IngredientBase ingredient = (IngredientBase) item;
            return ingredient.toast();
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
