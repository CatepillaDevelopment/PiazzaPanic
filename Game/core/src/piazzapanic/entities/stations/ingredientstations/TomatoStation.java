package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entities.foods.ingredients.Tomato;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class TomatoStation extends IngredientStationBase{

    public TomatoStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }


    @Override
    public IngredientBase getIngredientType() {
        //return new Tomato(this);
        return null;
    }

    @Override
    public void onHit(ChefBase chef){
        chef.pickUp(new Tomato());
    }

    @Override
    public String getName() {
        return "Tomato Station";
    }
    
}
