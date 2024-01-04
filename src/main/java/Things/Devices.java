package Things;

public abstract class Devices {
    String name;
    boolean isActive;

    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name;
    }

    public abstract void use ();

}
