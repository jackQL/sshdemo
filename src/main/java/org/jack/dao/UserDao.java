package org.jack.dao;

import org.jack.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public interface UserDao {
    void insert(User user);

    User login(String username, String password);
    List<User> getAll();
}
