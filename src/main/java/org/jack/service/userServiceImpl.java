package org.jack.service;

import org.jack.dao.UserDao;
import org.jack.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
