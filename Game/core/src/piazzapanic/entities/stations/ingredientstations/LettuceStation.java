package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entities.foods.ingredients.Lettuce;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class LettuceStation extends IngredientStationBase{

    public LettuceStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }

    @Override
    public void onHit(ChefBase chef){
        chef.pickUp(new Lettuce());
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Lettuce(this);
        return null;
    }

    @Override
    public String getName() {
        return "Lettuce Station";
    }
    
}
