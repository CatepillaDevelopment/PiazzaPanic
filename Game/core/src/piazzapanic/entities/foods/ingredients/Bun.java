package piazzapanic.entities.foods.ingredients;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public class Bun extends IngredientBase {
    private Texture texture;

    @Override
    public String getName() {
        return "Bun";
    }

    public Bun(/*FixedObjectBase spawnLocation*/) {
        //super(spawnLocation);
        this.texture = new Texture(Gdx.files.internal("food/bun.png"));
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/Bun.png";
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
        return true;
    }

    public Texture getTexture() { return this.texture; }

}
