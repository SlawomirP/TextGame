package Things;

public class Egg extends Food{
    public Egg() {
        this.name = "Egg";
    }
    @Override
    public String toString() {
        return this.name;
    }
}
