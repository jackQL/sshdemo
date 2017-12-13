package org.jack.service;

import org.jack.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
public interface UserService {

    void insert(User user);

    User login(String username, String password);

    List<User> getAll();
}
