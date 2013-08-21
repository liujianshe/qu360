package cn.qu360.user.service;

import cn.qu360.user.dao.UserDao;
import cn.qu360.user.model.User;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: jianshe
 * Date: 13-8-20
 * Time: 下午9:58
 * To change this template use File | Settings | File Templates.
 */

public class UserManager {

    public User queryForUser(String username,String password){
        return userDao.queryForUser(username,password);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;



}
