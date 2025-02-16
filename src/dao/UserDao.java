package dao;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static UserDao instance;
    private final Map<Integer, User> users = new HashMap<>();
    private int userIdCounter = 1;

    private UserDao() {}

    public static synchronized UserDao getInstance() {
        if (instance == null) {
            instance = new UserDao();
        }
        return instance;
    }

    public User saveUser(String name) {
        User user = new User(userIdCounter++, name);
        users.put(user.getId(), user);
        return user;
    }

    public User getUser(Long id) {
        return users.get(id);
    }
}
