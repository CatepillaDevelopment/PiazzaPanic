package piazzapanic.entities.furniture;

import piazzapanic.entitiysystem.fixed.furniture.WallBase;

public class Wall extends WallBase {

    public Wall(int layer) {
        super(layer);
    }

    @Override
    public String getName() {
        return "wall";
    }

}
