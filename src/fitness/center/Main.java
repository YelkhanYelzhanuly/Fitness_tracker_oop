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
      System.out.println("0. Выход");
      System.out.print("Выберите пункт: ");

      int choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        dao.findAll().forEach(System.out::println);
      }

      else if (choice == 2) {
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Вес: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        dao.save(new User(name, weight));
      }

      else if (choice == 3) {
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Новый вес: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        dao.updateWeight(name, weight);
      }

      else if (choice == 4) {
        System.out.print("Имя: ");
        String name = sc.nextLine();
        dao.delete(name);
      }

      else if (choice == 5) {
        System.out.print("Название тренировки: ");
        String title = sc.nextLine();
        System.out.print("Интенсивность: ");
        double intensity = sc.nextDouble();
        System.out.print("Длительность (мин): ");
        double duration = sc.nextDouble();
        sc.nextLine();

        Activity workout = new Workout(title, intensity, duration);
        System.out.println("\n" + workout);
      }

      else if (choice == 0) {
        System.out.println("Выход из программы.");
        break;
      }

      else {
        System.out.println("Неверный пункт меню.");
      }
    }

    sc.close();
  }
}

