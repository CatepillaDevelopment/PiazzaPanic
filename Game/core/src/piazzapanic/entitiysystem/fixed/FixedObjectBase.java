package piazzapanic.entitiysystem.fixed;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.EntityBase;

public abstract class FixedObjectBase extends EntityBase {
    //layer defines the object layer
    public FixedObjectBase(int layer){

        // Loop through all fixed objects in a layer
        for(MapObject object : this.map.getLayers().get(layer).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            // forces can't act on a static body
            this.bdef.type = BodyDef.BodyType.StaticBody;
            this.bdef.position.set(rect.getX() + rect.getWidth()/2, rect.getY() + rect.getHeight()/2);

            this.body = this.world.createBody(this.bdef);

            this.shape.setAsBox(rect.getWidth()/2, rect.getHeight()/2);
            this.fdef.shape = this.shape;
            this.body.createFixture(this.fdef);
        }
    }
}
