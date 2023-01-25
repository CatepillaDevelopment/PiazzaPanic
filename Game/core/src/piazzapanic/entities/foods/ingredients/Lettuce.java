package piazzapanic.entities.foods.ingredients;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public class Lettuce extends IngredientBase {

    @Override
    public String getName() {
        return "Lettuce";
    }

    public Lettuce(FixedObjectBase spawnLocation, TiledMap map, World world) {
        super(spawnLocation, map, world);
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Lettuce.png";
    }

    @Override
    public boolean canBeChopped() {
        return true;
    }

    @Override
    public boolean canBeFried() {
        return false;
    }

    @Override
    public boolean canBeGrilled() {
        return false;
    }

    @Override
    public boolean canBeToasted() {
        return false;
    }

}
