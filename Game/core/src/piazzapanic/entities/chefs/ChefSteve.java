package piazzapanic.entities.chefs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Fixture;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefSteve extends ChefBase{

    private Texture texture;

    @Override
    public float getXval() {
        return this.xval;
    }

    @Override
    public float getYval() {
        return this.yval;
    }

    public ChefSteve() {
        super(800, 600);
        for (Fixture fixture : this.fixtures) {
            fixture.setUserData(this);
        }
        this.xval = 800;
        this.yval = 600;
        this.texture = new Texture(Gdx.files.internal("chefs/Steve.png"));
    }

    @Override
    public String getName() {
        return "Steve";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefSteve.png";
    }

    public Texture getTexture() { return this.texture; }

}
