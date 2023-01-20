package piazzapanic.world;
import piazzapanic.entitiysystem.EntityBase;

import java.util.ArrayList;

public class World {

    private ArrayList<EntityBase> tiles;
    private ArrayList<EntityBase> workstations;
    private ArrayList<EntityBase> characters;
    private ArrayList<EntityBase> items;


    // Getters
    public ArrayList<EntityBase> getTiles() {
        return tiles;
    }

    public ArrayList<EntityBase> getWorkstations() {
        return workstations;
    }

    public ArrayList<EntityBase> getCharacters() {
        return characters;
    }

    public ArrayList<EntityBase> getItems() {
        return items;
    }
}
