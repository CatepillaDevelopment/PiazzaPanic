package piazzapanic.world;

import com.badlogic.gdx.physics.box2d.*;

import piazzapanic.entitiysystem.dynamic.characters.chefs.ChefBase;
import piazzapanic.core.GameHUD;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;
import piazzapanic.entitiysystem.fixed.furniture.WorkstationBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.IngredientStationBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.PreperationStationBase;

public class WorldContactListener implements ContactListener {
    @Override
    public void beginContact(Contact contact) {
        Fixture fixA = contact.getFixtureA();
        Fixture fixB = contact.getFixtureB();

        if(fixA.getUserData() instanceof ChefBase || fixB.getUserData() instanceof ChefBase){
            Fixture chef = (fixA.getUserData() instanceof ChefBase) ? fixA : fixB;
            Fixture object = chef == fixA ? fixB : fixA;

            if(object.getUserData() != null  && WorkstationBase.class.isAssignableFrom(object.getUserData().getClass())){
                WorkstationBase workstation = (WorkstationBase) object.getUserData();
                workstation.onHit((ChefBase) chef.getUserData());
                GameHUD.setTouching(workstation.getName());
            }
        }
    }

    @Override
    public void endContact(Contact contact) {
        GameHUD.clearTouching();
    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {

    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }
}
