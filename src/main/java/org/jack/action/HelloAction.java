package org.jack.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.jack.model.User;
import org.jack.service.UserService;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/12.
 */
public class HelloAction extends ActionSupport implements ModelDriven<User>{

    @Resource
    UserService userService;


    private User user = new User();
    public User getModel() {
        return user;
    }

    public String index(){
        return "index";
    }

    public String reg(){
        return  "reg";
    }

    public void doReg(){
        userService.insert(user);
    }
}
