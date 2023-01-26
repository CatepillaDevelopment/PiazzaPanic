package piazzapanic.entities.chefs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefAlex extends ChefBase{

    public ChefAlex(TiledMap map, World world) {
        super(map, world);

        // Draw Alex to the screen
        for(MapObject object : this.map.getLayers().get(7).getObjects()){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            // forces can't act on a static body
            this.bdef.type = BodyDef.BodyType.DynamicBody;
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

    @Override
    public void update(){
        checkUserInput();
    }


    private void checkUserInput(){
        float velX = 0, velY = 0;

        // Up
        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            velY = 1;
        }
        // Down
        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            velY = -1;
        }
        // Right
        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            velX = 1;
        }
        // Left
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            velX = -1;
        }

        //Move the body
        this.body.setLinearVelocity(velX * this.speed, velY * this.speed);
    }

}
