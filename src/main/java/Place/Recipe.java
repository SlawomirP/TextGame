package Place;

import Things.*;

import java.util.ArrayList;

public class Recipe extends Place {

    public Recipe() {
        addItem(new Pepper());
        addItem(new Salt());
        addItem(new Egg());
        addItem(new Butter());
    }



}
