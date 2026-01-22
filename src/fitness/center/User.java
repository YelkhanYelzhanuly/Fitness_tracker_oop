package fitness.center;

public class User {
    private int id;
    private String name;
    private double weight;
    private String last_name;

    public User(int id, String name, String last_name, double weight) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.weight = weight;
    }
    public User(String name, String last_name, double weight) {
        this.name = name;
        this.last_name = last_name;
        this.weight = weight;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return last_name;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return id + " | " + name + " " + last_name + " - " + weight + " кг";
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




