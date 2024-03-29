package piazzapanic.world;
import piazzapanic.entities.chefs.ChefAlex;
import piazzapanic.entities.chefs.ChefSteve;
import piazzapanic.entities.furniture.Wall;
import piazzapanic.entities.stations.ingredientstations.*;
import piazzapanic.entities.stations.workstations.ChoppingStation;
import piazzapanic.entities.stations.workstations.Fryer;
import piazzapanic.entities.stations.workstations.Grill;
import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.entitiysystem.fixed.furniture.WorkstationBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;

import java.util.ArrayList;
import java.util.List;

//this class should contain all the non LibGDX stuff
public class GameWorld {
    private static TileMap tileMap;
    private List<WorkstationBase> workstations;
    private List<IngredientStationBase> ingredientStations;
    private List<ChefBase> chefs;
    private ChefBase currentChef;

    public GameWorld() {
        this.workstations = new ArrayList<>();
        this.chefs = new ArrayList<>();
        this.currentChef = null;
        this.ingredientStations = new ArrayList<>();
        GameWorld.tileMap =  new TileMap();

        workstations.add(new ChoppingStation(0));
        workstations.add(new Fryer(0));
        workstations.add(new Grill(0));

        ingredientStations.add(new BunStation(0));
        ingredientStations.add(new LettuceStation(0));
        ingredientStations.add(new OnionStation(0));
        ingredientStations.add(new PattyStation(0));
        ingredientStations.add(new TomatoStation(0));

        new Wall(0);


        // Create chefs (index 0 = Alex, index 1 = Steve)
        this.chefs.add(new ChefAlex());
        this.chefs.add(new ChefSteve());
        this.currentChef = this.chefs.get(0);

        tileMap.getWorld().setContactListener(new WorldContactListener());
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

    public void setCurrentChef(int i) {
        this.currentChef = this.chefs.get(i);
    }
}
