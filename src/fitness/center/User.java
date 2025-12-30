package fitness.center;

import java.util.Objects;

public class User {
    private String name;
    private double weight;
    public User(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    @Override
    public String toString() {
        return "Пользователь: " + name + ", Вес: " + weight + " кг";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.weight, weight) == 0 && Objects.equals(name, user.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}