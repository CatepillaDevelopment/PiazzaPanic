package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entities.foods.ingredients.Onion;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class OnionStation extends IngredientStationBase{

    public OnionStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }


    @Override
    public IngredientBase getIngredientType() {
        return null;
        //return new Onion(this);
    }

    @Override
    public void onHit(ChefBase chef){
        chef.pickUp(new Onion());
    }

    @Override
    public String getName() {
        return "Onion Station";
    }
    
}
