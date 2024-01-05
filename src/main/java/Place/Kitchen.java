package Place;

import Things.*;


public class Kitchen extends Place {
    public Kitchen() {
        addItem(new Stove());
        addItem(new Pan());
        addItem(new Plate());

    }

}
