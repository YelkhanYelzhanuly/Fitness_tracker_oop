package fitness.center;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final String url = "jdbc:postgresql://localhost:5432/OOPproject";
    private final String user = "postgres";
    private final String password = "414141";

    public void save(User userObj) {
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = c.prepareStatement("INSERT INTO users (name, weight) VALUES (?, ?)");
            ps.setString(1, userObj.getName());
            ps.setDouble(2, userObj.getWeight());
            ps.executeUpdate();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT id, name, weight FROM users");
            while (rs.next()) {
                users.add(new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("weight")
                ));
            }
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    public void updateWeightById(int id, double weight) {
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = c.prepareStatement("UPDATE users SET weight = ? WHERE id = ?");
            ps.setDouble(1, weight);
            ps.setInt(2, id);
            ps.executeUpdate();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteById(int id) {
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            PreparedStatement ps =
                    c.prepareStatement("DELETE FROM users WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



