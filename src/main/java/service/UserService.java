package service;

import java.util.List;
import models.User;

public interface UserService {
    void add(User user);

    User getById(Long userId);

    List<User> listUsers();
}
