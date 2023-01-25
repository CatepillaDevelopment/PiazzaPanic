package piazzapanic.entities.stations.workstations;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.physics.box2d.World;
import piazzapanic.entitiysystem.dynamic.items.ItemBase;
import piazzapanic.entitiysystem.dynamic.items.foods.IngredientBase;
import piazzapanic.entitiysystem.fixed.workstations.workstationvariations.PreperationStationBase;

public class Grill extends PreperationStationBase {

    public Grill(int layer, TiledMap map, World world) {
        super(layer, map, world);
    }

    @Override
    public String getName() {
        return "Grill";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/stations/workstations/data/Grill.png";
    }

    @Override
    public boolean processItem(ItemBase item) {
        if (item instanceof IngredientBase){
            IngredientBase ingredient = (IngredientBase) item;
            return ingredient.grill();
        }
        else {
            item.ruin();
            return false;
        }
    }

    @Override
    public int getProcessTime() {
        return 20;
    }

    @Override
    public int getPrecisionTime() {
        return 5;
    }

}
