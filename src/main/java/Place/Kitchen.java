package Place;

import Things.Pan;
import Things.Plate;
import Things.Stove;

public class Kitchen extends Place {
    public Kitchen() {
        add(new Stove());
        add(new Pan());
        add(new Plate());
    }
}
