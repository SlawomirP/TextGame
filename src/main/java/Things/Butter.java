package Things;

public class Butter extends Food {
    public Butter() {
        this.name = "masło";
    }

    @Override
    public int compareTo(Food o) {
        return this.name.compareTo(o.getName());
    }

    public boolean equals(Object obj) {
        Butter tempObj = (Butter) obj;
        return this.name.equals(tempObj.name);
    }
}
