package piazzapanic.entities.foods.ingredients;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

public class Tomato extends IngredientBase{
    @Override
    public String getName() {
        return "Tomato";
    }
    private Texture texture;

    public Tomato(/*FixedObjectBase spawnLocation*/) {
//        super(spawnLocation);
        texture = new Texture(Gdx.files.internal("food/tomato.png"));
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

    public Texture getTexture() { return texture; }
}
