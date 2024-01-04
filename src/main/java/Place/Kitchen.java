package Place;

import Things.Pan;
import Things.Plate;
import Things.Stove;

public class Kitchen extends Place {
    public Kitchen() {
        addItem(new Stove());
        addItem(new Pan());
        addItem(new Plate());
    }
}
