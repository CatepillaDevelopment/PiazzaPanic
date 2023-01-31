package piazzapanic.entitiysystem.fixed;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.EntityBase;
import piazzapanic.world.GameWorld;

import java.util.ArrayList;
import java.util.List;

public abstract class FixedObjectBase extends EntityBase {

    protected BodyDef bdef;
    protected PolygonShape shape;
    protected FixtureDef fdef;
    protected Body body;
    protected List<Fixture> fixtures;

    //layer defines the object layer
    public FixedObjectBase(int layer){

        this.bdef = new BodyDef();
        this.shape = new PolygonShape();
        this.fdef = new FixtureDef();
        this.fixtures = new ArrayList();

        createStaticObject();

    }

    public void createStaticObject(){
        for (MapObject object : GameWorld.getTileMap().getMap().getLayers().get(getName()).getObjects().getByType(RectangleMapObject.class)) {
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set((rect.getX() + rect.getWidth() / 2), (rect.getY() + rect.getHeight() / 2));

            body = GameWorld.getTileMap().getWorld().createBody(bdef);

            shape.setAsBox(rect.getWidth() / 2, rect.getHeight() / 2);
            fdef.shape = shape;
            fixtures.add(body.createFixture(fdef));
        }
    }

    @Override
    protected BodyDef getBodyDef(){
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(0, 0);
        bodyDef.type = BodyDef.BodyType.StaticBody;

        return bodyDef;
    }

    public List<Fixture> getFixtures(){
        return this.fixtures;
    }
}
