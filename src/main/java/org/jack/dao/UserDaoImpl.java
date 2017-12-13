package org.jack.dao;

import org.hibernate.SessionFactory;
import org.jack.model.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements  UserDao {

    @Resource
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public List<User> getAll() {
        return (List<User>) getHibernateTemplate().find("from User");
    }

    public void insert(User user) {
        getHibernateTemplate().save(user);
    }

    public User login(String username, String password) {
        List<User> list = (List<User>) getHibernateTemplate().find("from t_user where username=? and password=?",username,password);
        if (list != null && list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
