package piazzapanic.entities.foods.ingredients;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;

public class Lettuce extends IngredientBase {
    private Texture texture;

    @Override
    public String getName() {
        return "Lettuce";
    }

    public Lettuce() {
        texture = new Texture(Gdx.files.internal("food/lettuce.png"));
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

    public Texture getTexture() {
        return this.texture;
    }
}
