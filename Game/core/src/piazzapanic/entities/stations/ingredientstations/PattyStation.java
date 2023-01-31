package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entities.foods.ingredients.Patty;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class PattyStation extends IngredientStationBase{

    public PattyStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }


    @Override
    public IngredientBase getIngredientType() {
        //return new Patty(this);
        return null;
    }

    @Override
    public void onHit(ChefBase chef){
        chef.pickUp(new Patty());
    }

    @Override
    public String getName() {
        return "Patty Station";
    }
    
}
