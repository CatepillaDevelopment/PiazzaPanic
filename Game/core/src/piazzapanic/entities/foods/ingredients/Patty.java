package piazzapanic.entities.foods.ingredients;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public class Patty extends IngredientBase{
    private Texture texture;
    @Override
    public String getName() {
        return "Patty";
    }

    public Patty(/*FixedObjectBase spawnLocation*/) {
//        super(spawnLocation);
    texture = new Texture(Gdx.files.internal("food/raw meat.png"));
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
        return true;
    }

    @Override
    public boolean canBeToasted() {
        return false;
    }

    public Texture getTexture() {
        return this.texture;
    }
}
