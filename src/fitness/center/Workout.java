package fitness.center;

public class Workout extends Activity {
    private double intensity;
    private double duration;

    public Workout(String title, double intensity, double duration) {
        super(title);
        this.intensity = intensity;
        this.duration = duration;
    }

    @Override
    public double calories() {
        return intensity * duration;
    }

    @Override
    public String toString() {
        return "Тренировка: " + title +
                "\nИнтенсивностб: " + intensity +
                "\nДлительность: " + duration + " мин" +
                "\nСожжено калорий: " + calories();
    }
}
