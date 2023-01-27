package piazzapanic.world;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

//this class should ONLY contain LibGDX stuff
public class TileMap {

    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    //Box2d variables
    private World world;

    public World getWorld() {
        return this.world;
    }

    public TmxMapLoader getMapLoader() {
        return this.mapLoader;
    }

    public TiledMap getMap() {
        return map;
    }

    public OrthogonalTiledMapRenderer getRenderer() {
        return this.renderer;
    }

    public TileMap(){
        this.mapLoader = new TmxMapLoader();
        this.map = mapLoader.load("gameLevel/Level.tmx");
        this.renderer = new OrthogonalTiledMapRenderer(map);
        //no gravity
        this.world = new World(new Vector2(0, 0), true);
    }

}
