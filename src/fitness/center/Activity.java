package fitness.center;

public abstract class Activity {
    protected String title;

    public Activity(String title) {
        this.title = title;
    }

    public abstract double calories();

    @Override
    public String toString() {
        return "Активность: " + title;
    }
}

