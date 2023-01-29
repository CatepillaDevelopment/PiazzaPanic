package piazzapanic.world;

import com.badlogic.gdx.physics.box2d.*;
import piazzapanic.entitiysystem.fixed.FixedObjectBase;
import piazzapanic.entitiysystem.fixed.furniture.workstations.PreperationStationBase;

public class WorldContactListener implements ContactListener {
    @Override
    public void beginContact(Contact contact) {
        Fixture fixA = contact.getFixtureA();
        Fixture fixB = contact.getFixtureB();
        System.out.println("HU");

        if(fixA.getUserData() == "chef" || fixB.getUserData() == "chef"){
            Fixture chef = fixA.getUserData() == "chef" ? fixA : fixB;
            Fixture object = chef == fixA ? fixB : fixA;

            if(object.getUserData() != null  && PreperationStationBase.class.isAssignableFrom(object.getUserData().getClass())){
                ((PreperationStationBase) object.getUserData()).onHit();
            }
        }
    }

    @Override
    public void endContact(Contact contact) {

    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {

    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }
}
