package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entities.foods.ingredients.Lettuce;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;
import piazzapanic.world.GameWorld;

public class LettuceStation extends IngredientStationBase{

    public LettuceStation(int layer) {
        super(layer);
        for(Fixture fixture : fixtures)
            fixture.setUserData(this);
    }

    @Override
    public void onHit(ChefBase chef){
        System.out.println("lettucestation hit");
        chef.pickUp(new Lettuce());
    }

    @Override
    public IngredientBase getIngredientType() {
        //return new Lettuce(this);
        return null;
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/LettuceStation.png";
    }

    @Override
    public String getName() {
        return "Lettuce Station";
    }
    
}
