package fitness.center;

import java.util.Objects;

public class WorkoutPlan extends Activity {
    private double intensity;
    private double duration;

    public WorkoutPlan(String title, double intensity, double duration) {
        super(title);
        this.intensity = intensity;
        this.duration = duration;
    }
    @Override
    public double calculateBurnedCalories() {
        return intensity * duration;
    }
    @Override
    public String toString() {
        return String.format("%s [Длительность: %.1f мин, Калории: %.1f]",
                getTitle(), duration, calculateBurnedCalories());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkoutPlan)) return false;
        if (!super.equals(o)) return false;
        WorkoutPlan that = (WorkoutPlan) o;
        return Double.compare(that.intensity, intensity) == 0 &&
                Double.compare(that.duration, duration) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intensity, duration);
    }
}