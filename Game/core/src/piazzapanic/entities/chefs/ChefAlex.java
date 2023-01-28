package piazzapanic.entities.chefs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.world.GameWorld;

public class ChefAlex extends ChefBase{

    public ChefAlex() {
        this.xval = 400;
        this.yval = 600;
    }

    @Override
    public String getName() {
        return "Alex";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefAlex.png";
    }

}
