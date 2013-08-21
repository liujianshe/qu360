package cn.qu360.user.dao;

import cn.qu360.user.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: jianshe
 * Date: 13-8-20
 * Time: 下午9:40
 * To change this template use File | Settings | File Templates.
 */

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 根据用户名密码查找用户
     * @param userName
     * @param password
     * @return
     */
    public User queryForUser(String userName,String password){
        User user = this.jdbcTemplate.queryForObject(
                "select username, password from user where username = ? and password=?", new Object[]{userName, password},
                new RowMapper<User>() {
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();
                        user.setUserName(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        return user;
                    }
                });
        return user;
    }


}
