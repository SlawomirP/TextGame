package Things;

public abstract class Food implements Comparable<Food> {
    String name;

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }


}
