package com.lagou.edu.dao.impl;

import com.lagou.edu.dao.ADao;
import com.lagou.edu.pojo.A;
import com.lagou.edu.pojo.Account;
import com.lagou.edu.utils.ConnectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author 应癫
 */
@Repository
public class ADaoImpl implements ADao {

    @Autowired
    private ConnectionUtils connectionUtils;

    @Override
    public A queryById(int id) throws Exception {
        Connection con = connectionUtils.getCurrentThreadConn();
        String sql = "select * from A where id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();

        A a = new A();
        while(resultSet.next()) {
            a.setId(resultSet.getInt("id"));
            a.setName(resultSet.getString("name"));
        }

        resultSet.close();
        preparedStatement.close();
        //con.close();
        return a;
    }
}
