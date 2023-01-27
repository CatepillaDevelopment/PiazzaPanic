package piazzapanic.entitiysystem.fixed.furniture;

import com.badlogic.gdx.physics.box2d.FixtureDef;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;

import java.util.List;

public abstract class WorkstationBase extends FixedObjectBase {
    @Override
    protected List<FixtureDef> getFixtureDefs() {
        return null;
    }

    //Layer defines the object layer
    public WorkstationBase(int layer){
        super(layer);
    }
}
