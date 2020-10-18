package service;

import dao.UserDao;
import java.util.List;
import models.User;

public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
