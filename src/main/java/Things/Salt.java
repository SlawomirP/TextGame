package Things;

public class Salt extends Food {
    public Salt() {
        this.name = "sól";
    }

    @Override
    public int compareTo(Food o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object obj) {
        Salt tempObj = (Salt) obj;
        return this.name.equals(tempObj.name);
    }
}
