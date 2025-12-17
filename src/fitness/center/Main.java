package fitness.center;

public class Main {

  public static void main(String[] args) {

    User u1 = new User("Иван", 80.0);
    User u2 = new User("Анна", 60.0);

    WorkoutPlan run = new WorkoutPlan("Бег", 500);
    WorkoutPlan swim = new WorkoutPlan("Плавание", 400);

    FitnessApp app = new FitnessApp(u1, run);

    u1.printUser();
    u2.printUser();
    run.printPlan();
    swim.printPlan();

    System.out.println("\n--- СРАВНЕНИЕ ---");
    run.compareTo(swim);

    System.out.println("\n--- РАБОТА ПРИЛОЖЕНИЯ ---");
    app.showSession();

    u1.setWeight(75.0);
    System.out.println("Новый вес Ивана: " + u1.getWeight());
  }
}
