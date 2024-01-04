package Things;

public class Egg extends Food {
    public Egg() {
        this.name = "jajka";
    }


    @Override
    public int compareTo(Food o) {
        return this.name.compareTo(o.getName());
    }

    public boolean equals(Object obj) {
        Egg tempObj = (Egg)obj;
        return this.name.equals(tempObj.name);
    }
}
