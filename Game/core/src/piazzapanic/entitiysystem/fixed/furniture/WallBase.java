package piazzapanic.entitiysystem.fixed.furniture;

import com.badlogic.gdx.physics.box2d.FixtureDef;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

import java.util.List;

public abstract class WallBase extends FixedObjectBase {

    public WallBase(int layer){
        super(layer);
    }
    @Override
    public String getTextureFilePath() {
        return null;
    }

    @Override
    protected List<FixtureDef> getFixtureDefs() {
        return null;
    }
}
