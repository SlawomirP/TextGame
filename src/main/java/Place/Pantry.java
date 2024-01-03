package Place;

import Things.Egg;
import Things.Pepper;
import Things.Salt;

public class Pantry extends Place{

    public Pantry() {
        add(new Egg());
        add(new Egg());
        add(new Egg());
        add(new Salt());
        add(new Pepper());
    }
}
