package fitness.center;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    UserDAO dao = new UserDAO();

    while (true) {
      System.out.println("\n=== FITNESS CENTER ===");
      System.out.println("1. Показать пользователей");
      System.out.println("2. Добавить пользователя");
      System.out.println("3. Обновить вес");
      System.out.println("4. Удалить пользователя");
      System.out.println("5. Создать тренировку");
      System.out.println("6. бновить фамилию");
      System.out.println("0. Выход");
      System.out.print("Выбор: ");

      int choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        dao.findAll().forEach(System.out::println);
      } else if (choice == 2) {
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Фамилия: ");
        String last_name = sc.nextLine();
        System.out.print("Вес: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        dao.save(new User(name, last_name, weight));
      } else if (choice == 3) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Новый вес: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        dao.updateWeightById(id, weight);
      } else if (choice == 4) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        dao.deleteById(id);
      } else if (choice == 5) {
        System.out.print("Название: ");
        String title = sc.nextLine();
        System.out.print("Интенсивность: ");
        double intensity = sc.nextDouble();
        System.out.print("Длительность: ");
        double duration = sc.nextDouble();
        sc.nextLine();
        Activity workout = new Workout(title, intensity, duration);
        System.out.println("\n" + workout);
      } else if (choice == 6) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Новая фамилия: ");
        String last_name = sc.nextLine();
        dao.updateLastNameById(id, last_name);
      } else if (choice == 0) {
        break;
      }
    }
    sc.close();
  }
}


