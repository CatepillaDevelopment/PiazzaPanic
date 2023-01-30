package piazzapanic.entities.stations.ingredientstations;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;
import piazzapanic.world.GameWorld;

public class OnionStation extends IngredientStationBase{

    public OnionStation(int layer) {
        super(layer);
    }


    @Override
    public IngredientBase getIngredientType() {
        return null;
        //return new Onion(this);
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/ingredientstations/data/OnionStation.png";
    }

    @Override
    public String getName() {
        return "Onion Station";
    }
    
}
