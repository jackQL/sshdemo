package org.jack.service;

import org.jack.dao.UserDao;
import org.jack.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
@Service
public class userServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    public void insert(User user) {
        userDao.insert(user);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User login(String username, String password) {
        return userDao.login(username,password);
    }

}
