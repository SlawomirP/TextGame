package Place;

import Things.*;


public class Pantry extends Place {

    public Pantry() {
        addItem(new Egg());
        addItem(new Salt());
        addItem(new Pepper());
        addItem(new Butter());
    }
}
