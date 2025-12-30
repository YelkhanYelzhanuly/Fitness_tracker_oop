package fitness.center;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FitnessCenter {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }
    public List<User> findUsersByName(String name) {
        return users.stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
    public void sortByWeight() {
        users.sort(Comparator.comparingDouble(User::getWeight));
    }
    public void showAllUsers() {
        users.forEach(System.out::println);
    }
}
