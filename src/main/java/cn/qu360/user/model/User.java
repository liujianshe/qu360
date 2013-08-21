package cn.qu360.user.model;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: jianshe
 * Date: 13-8-20
 * Time: 下午9:29
 */
public class User {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Timestamp getMt() {
        return mt;
    }

    public void setMt(Timestamp mt) {
        this.mt = mt;
    }

    public Timestamp getCt() {
        return ct;
    }

    public void setCt(Timestamp ct) {
        this.ct = ct;
    }

    private long id;
    private String userName;
    private String password;
    private String email;
    private boolean isActive;
    private Timestamp mt;
    private Timestamp ct;
}
