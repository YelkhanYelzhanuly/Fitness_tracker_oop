package fitness.center;


import java.util.Objects;

public abstract class Activity {
    private String title;
    public Activity(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public abstract double calculateBurnedCalories();
    @Override
    public String toString() {
        return "Активность: " + title;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(title, activity.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
