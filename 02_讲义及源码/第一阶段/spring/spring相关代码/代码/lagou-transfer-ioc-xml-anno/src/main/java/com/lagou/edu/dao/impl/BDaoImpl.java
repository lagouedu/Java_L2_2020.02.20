package com.lagou.edu.dao.impl;

import com.lagou.edu.dao.BDao;
import com.lagou.edu.pojo.A;
import com.lagou.edu.pojo.B;
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
public class BDaoImpl implements BDao {

    @Autowired
    private ConnectionUtils connectionUtils;

    @Override
    public B queryById(int id) throws Exception {
            Connection con = connectionUtils.getCurrentThreadConn();
            String sql = "select * from B where id=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            B b = new B();
            while(resultSet.next()) {

                b.setId(resultSet.getInt("id"));
                b.setXingming(resultSet.getString("xingming"));
            }

            resultSet.close();
            preparedStatement.close();
            //con.close();
            return b;

    }

}
