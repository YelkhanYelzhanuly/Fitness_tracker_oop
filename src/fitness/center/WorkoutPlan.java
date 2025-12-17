package fitness.center;

public class WorkoutPlan {
    private String type;
    private double calories;

    public WorkoutPlan(String type, double calories) {
        this.type = type;
        this.calories = calories;
    }

    public String getType() { return type; }
    public double getCalories() { return calories; }

    public void printPlan() {
        System.out.println("Тренировка: " + type + " [" + calories + " ккал]");
    }

    public void compareTo(WorkoutPlan other) {
        if (this.calories > other.calories) {
            System.out.println(this.type + " сжигает больше, чем " + other.type);
        } else {
            System.out.println(other.type + " сжигает больше, чем " + this.type);
        }
    }
}