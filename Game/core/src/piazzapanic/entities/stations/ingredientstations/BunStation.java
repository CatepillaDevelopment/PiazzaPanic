package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entities.foods.ingredients.Bun;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

public class BunStation extends IngredientStationBase{

    public BunStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }

    @Override
    public void onHit(ChefBase chef){
        chef.pickUp(new Bun());
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Bun(this);
        return null;
    }

    @Override
    public String getName() {
        return "Bun Station";
    }
    
}
