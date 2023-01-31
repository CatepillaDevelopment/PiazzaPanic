package piazzapanic.entities.chefs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Fixture;

import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefAlex extends ChefBase{

    private Texture texture;

    @Override
    public float getXval() {
        return this.xval;
    }

    @Override
    public float getYval() {
        return this.yval;
    }

    public ChefAlex() {
        super(400, 600);
        for (Fixture fixture : fixtures) {
            fixture.setUserData(this);
        }
        this.xval = 400;
        this.yval = 600;
        this.texture = new Texture(Gdx.files.internal("chefs/Alex.png"));
    }

    @Override
    public String getName() {
        return "Alex";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefAlex.png";
    }

    public Texture getTexture() { return this.texture; }

}
