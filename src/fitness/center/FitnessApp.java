package fitness.center;

public class FitnessApp {
    private User user;
    private WorkoutPlan plan;

    public FitnessApp(User user, WorkoutPlan plan) {
        this.user = user;
        this.plan = plan;
    }

    public void showSession() {
        System.out.println("=== Текущая сессия фитнеса ===");
        user.printUser();
        plan.printPlan();
        System.out.println("==============================");
    }
}
