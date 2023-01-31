package piazzapanic.entities.foods.ingredients;

import org.w3c.dom.Text;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public class Onion extends IngredientBase{
    private Texture texture;

    @Override
    public String getName() {
        return "Onion";
    }

    public Onion() {
    texture = new Texture(Gdx.files.internal("food/onion.png"));
    }

    @Override
    public boolean canBeChopped() {
        return true;
    }

    @Override
    public boolean canBeFried() {
        return true;
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
