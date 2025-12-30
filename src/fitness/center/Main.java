package fitness.center;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    FitnessCenter center = new FitnessCenter();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Сколько пользователей вы хотите добавить? ");
    int count = scanner.nextInt();
    scanner.nextLine();1

    for (int i = 0; i < count; i++) {
      System.out.println("\nВвод данных пользователя #" + (i + 1) + ":");

      System.out.print("Введите имя: ");
      String name = scanner.nextLine();

      System.out.print("Введите вес: ");
      double weight = scanner.nextDouble();
      scanner.nextLine(); // Очистка буфера после ввода double

      center.addUser(new User(name, weight));
    }

    System.out.println("Список пользователей центра:");
    center.showAllUsers();

    System.out.println("\nСортировка пользователей по весу...");
    center.sortByWeight();
    center.showAllUsers();

    System.out.print("\nВведите имя для поиска: ");
    String searchName = scanner.nextLine();
    List<User> found = center.findUsersByName(searchName);

    if (found.isEmpty()) {
      System.out.println("Пользователь не найден.");
    } else {
      found.forEach(u -> System.out.println("Найдено: " + u));
    }
    System.out.println("\nПример тренировочного плана:");
    Activity run = new WorkoutPlan("Бег", 12.0, 45.0);
    System.out.println(run.toString());

    scanner.close();
  }
}
