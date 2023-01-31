package piazzapanic.world;

import com.badlogic.gdx.physics.box2d.*;

import piazzapanic.entitiysystem.dynamic.characters.ChefBase;
import piazzapanic.core.GameHUD;
import piazzapanic.entitiysystem.fixed.furniture.WorkstationBase;

public class WorldContactListener implements ContactListener {
    @Override
    public void beginContact(Contact contact) {
        Fixture fixA = contact.getFixtureA();
        Fixture fixB = contact.getFixtureB();

        // Check if the collision involves a chef
        if(fixA.getUserData() instanceof ChefBase || fixB.getUserData() instanceof ChefBase){
            // Find which collision what the chef and which was the object
            Fixture chef = (fixA.getUserData() instanceof ChefBase) ? fixA : fixB;
            Fixture object = chef == fixA ? fixB : fixA;

            // Interact with the workstations
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
