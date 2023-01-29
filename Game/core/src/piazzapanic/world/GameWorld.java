package piazzapanic.world;
import piazzapanic.entities.chefs.ChefAlex;
import piazzapanic.entities.chefs.ChefSteve;
import piazzapanic.entities.stations.workstations.CuttingStation;
import piazzapanic.entities.stations.workstations.Fryer;
import piazzapanic.entities.stations.workstations.Grill;
import piazzapanic.entities.stations.workstations.Toaster;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.entitiysystem.fixed.furniture.WorkstationBase;

import java.util.ArrayList;
import java.util.List;

//this class should contain all the non LibGDX stuff
public class GameWorld {
    private static TileMap tileMap;
    private List<WorkstationBase> workstations;
    private List<ChefBase> chefs;
    private ChefBase currentChef;

    public GameWorld() {
        this.workstations = new ArrayList<>();
        this.chefs = new ArrayList<>();
        this.currentChef = null;
        this.tileMap =  new TileMap();

        // layer not necessary anymore
        workstations.add(new CuttingStation(0));
        workstations.add(new Fryer(0));
        workstations.add(new Grill(0));
        /*
        new CuttingStation(4);
        new Grill(2);
        new Fryer(3);
        // Actually counter
        new Toaster(6);
        // Actually wall
        new Toaster(5);
         */

        // Create chefs (index 0 = Alex, index 1 = Steve)
        this.chefs.add(new ChefAlex());
        this.chefs.add(new ChefSteve());
        this.currentChef = this.chefs.get(0);
    }

    public ChefBase getCurrentChef() {
        return this.currentChef;
    }

    // Getters
    public static TileMap getTileMap() {
        return GameWorld.tileMap;
    }

    public List<WorkstationBase> getWorkstations() {
        return this.workstations;
    }

    public List<ChefBase> getCharacters() {
        return this.chefs;
    }
}
