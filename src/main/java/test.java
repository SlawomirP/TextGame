import Place.Bag;
import Place.Kitchen;
import Things.*;

public class test {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Kitchen kitchen = new Kitchen();

        Devices stove = (Devices)kitchen.getObject(0);
        System.out.println(stove.getName());
        System.out.println(stove.getActiveStatus());
        stove.use();
        System.out.println(stove.getActiveStatus());

    }
}
