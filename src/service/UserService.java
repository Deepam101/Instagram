package service;

import dao.UserDao;
import model.User;

public class UserService {
    private static UserService userService;

    public static synchronized UserService getInstance() {
        if(userService == null)
            userService = new UserService();
        return userService;
    }

    public User createUser(String name) {
        UserDao userDao = UserDao.getInstance();
        return userDao.saveUser(name);
    }
}
