package piazzapanic.world;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entities.chefs.ChefAlex;
import piazzapanic.entities.stations.workstations.CuttingStation;
import piazzapanic.entities.stations.workstations.Fryer;
import piazzapanic.entities.stations.workstations.Grill;
import piazzapanic.entities.stations.workstations.Toaster;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

public class TileMap {

    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    private ChefBase alex;

    //Box2d variables
    private World world;


    public World getWorld() {
        return world;
    }

    public TmxMapLoader getMapLoader() {
        return mapLoader;
    }

    public TiledMap getMap() {
        return map;
    }

    public OrthogonalTiledMapRenderer getRenderer() {
        return renderer;
    }

    public TileMap(){
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("gameLevel/Level.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);

        //no gravity
        world = new World(new Vector2(0, 0), true);

        new CuttingStation(4, map, world);
        new Grill(2, map, world);
        new Fryer(3, map, world);
        // Actually counter
        new Toaster(6, map, world);
        // Actually wall
        new Toaster(5, map, world);

        // Create chef
        this.alex = new ChefAlex(map, world);

    }

}
