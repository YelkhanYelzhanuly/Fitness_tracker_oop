package fitness.center;

public class User {
    private String name;
    private double weight;

    public User(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }

    public void setWeight(double weight) {
        if (weight > 0) this.weight = weight;
    }

    public void printUser() {
        System.out.println("Пользователь: " + name + ", Вес: " + weight + " кг");
    }
}