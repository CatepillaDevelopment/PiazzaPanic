package piazzapanic.entities.chefs;

import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;

public class ChefSteve extends ChefBase{

    @Override
    public String getName() {
        return "Steve";
    }

    @Override
    public String getTextureFilePath() {
        return "src/piazzapanic/entities/workstations/data/ChefSteve.png";
    }

}
