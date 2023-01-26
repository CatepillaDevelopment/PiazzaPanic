package piazzapanic.entities.chefs;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefAlex extends ChefBase{

    public ChefAlex(TiledMap map, World world) {
        super(map, world);

        for(MapObject object : this.map.getLayers().get(7).getObjects()){
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

    @Override
    public String getName() {
        return "Alex";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefAlex.png";
    }

}
