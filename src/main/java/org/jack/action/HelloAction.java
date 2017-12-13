package org.jack.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.jack.model.User;
import org.jack.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/12/12.
 */
public class HelloAction extends ActionSupport implements ModelDriven<User>{
    //定义上传的文件名，属性命名：jsp中文件字段的name属性+FileName
    private String photoFileName;
    //属性名和jsp中文件字段的name属性一致，该photo对象是一个临时文件
    private File photo;
    //获取上传文件的类型

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    private String photoContentType;

    @Resource
    UserService userService;

    private List<User> list = new ArrayList<User>();

    public List<User> getList() {
        return list;
    }

    public String index(){
        list.addAll(userService.getAll());
        return "index";
    }

    public String reg(){
        return  "reg";
    }

    public String doReg(){
        //获取到文件上传目录
        String realPath = ServletActionContext.getServletContext().getRealPath("/img");
        File file = new File(realPath);
        if (!file.exists()){
            file.mkdir();
        }
        String fileName = UUID.randomUUID()+"_"+photoFileName;
        HttpServletRequest request = ServletActionContext.getRequest();
        String photoPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/img/"+fileName;
        System.out.println(photoPath);
        user.setUserphoto(photoPath);
        this.photo.renameTo(new File(file, fileName));
        userService.insert(user);
        return "login";
    }

    public String doLogin(){
        User login = userService.login(user.getUsername(),user.getPassword());
        if (login != null){
            return "index";
        } else {
            return "login";
        }
    }

    private User user = new User();
    public User getModel() {
        return user;
    }

    public String login(){
        return "login";
    }
}
