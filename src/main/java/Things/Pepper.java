package Things;

public class Pepper extends Food {
    public Pepper() {
        this.name = "pieprz";
    }


    @Override
    public int compareTo(Food o) {
        return this.name.compareTo(o.getName());
    }

    public boolean equals(Object obj) {
        Pepper tempObj = (Pepper)obj;
        return this.name.equals(tempObj.name);
    }
}
