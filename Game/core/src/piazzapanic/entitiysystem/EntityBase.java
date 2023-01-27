package piazzapanic.entitiysystem;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.world.GameWorld;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public abstract class EntityBase extends Sprite {
    protected String name;

    public abstract String getTextureFilePath();
    public abstract String getName();

    protected abstract BodyDef getBodyDef();
    protected abstract List<FixtureDef> getFixtureDefs();


    // Ben's stuff
    protected Body body;

    public EntityBase(){
        this.name = this.getName();

        World world = GameWorld.getTileMap().getWorld();
        BodyDef bodyDef = this.getBodyDef();
        List<FixtureDef> fixtureDefs = this.getFixtureDefs();

        this.body = world.createBody(bodyDef);
        //add all fixtures
        if (fixtureDefs != null){
            for (FixtureDef fixtureDef : fixtureDefs) {
                this.body.createFixture(fixtureDef);
            }
        }
    }

    public File getTextureFile() throws FileNotFoundException{
        String textureFilePath = this.getTextureFilePath();
        File textureFile = new File(textureFilePath);
        if (textureFile.exists()){
            return textureFile;
        } else{
            throw new FileNotFoundException(textureFilePath);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getBody() {
        return this.body;
    }
}