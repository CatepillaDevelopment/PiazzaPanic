package piazzapanic.entitiysystem.fixed.furniture;

import com.badlogic.gdx.physics.box2d.FixtureDef;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

import java.util.List;

public abstract class CounterBase extends FixedObjectBase {

    @Override
    protected List<FixtureDef> getFixtureDefs() {
        return null;
    }

    public CounterBase(int layer) {
        super(layer);
    }
}
