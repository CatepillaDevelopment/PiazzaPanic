package piazzapanic.entities.furniture;

import piazzapanic.entitiysystem.fixed.furniture.CounterBase;

public class Counter extends CounterBase {
    public Counter(int layer) {
        super(layer);
    }

    @Override
    public String getName() {
        return "counter";
    }
}
