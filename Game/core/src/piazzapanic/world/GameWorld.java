package piazzapanic.world;
import piazzapanic.entitiysystem.EntityBase;
import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.fixed.workstations.WorkstationBase;

import java.util.ArrayList;
import java.util.List;

//this class should contain all the non LibGDX stuff
public class GameWorld {
    private static TileMap tileMap = new TileMap();
    private List<WorkstationBase> workstations;
    private List<ChefBase> chefs;
    private ChefBase currentChef;

    public GameWorld() {
        this.workstations = new ArrayList<>();
        this.chefs = new ArrayList<>();
        this.currentChef = null;
    }

    public ChefBase getCurrentChef() {
        return this.currentChef;
    }

    // Getters
    public static TileMap getTileMap() {
        return tileMap;
    }

    public List<WorkstationBase> getWorkstations() {
        return this.workstations;
    }

    public List<ChefBase> getCharacters() {
        return this.chefs;
    }
}
