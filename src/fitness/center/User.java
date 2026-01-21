package fitness.center;

public class User {
    private int id;
    private String name;
    private double weight;

    public User(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    public User(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return id + " | " + name + " - " + weight + " кг";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}


