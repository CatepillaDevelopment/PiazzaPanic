package piazzapanic.entitiysystem;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.*;

import java.io.File;
import java.io.FileNotFoundException;

public abstract class EntityBase {
    protected String name;

    public abstract String getTextureFilePath();
    public abstract String getName();


    // Ben's stuff
    protected BodyDef bdef;
    protected PolygonShape shape;
    protected FixtureDef fdef;
    protected Body body;
    protected TiledMap map;
    protected World world;

    public EntityBase(TiledMap map, World world){
        this.name = this.getName();
        this.world = world;
        this.map = map;
        this.bdef = new BodyDef();
        this.shape = new PolygonShape();
        this.fdef = new FixtureDef();


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
}