package com.lagou.edu.dao.impl;

import com.lagou.edu.dao.IBaseDao;
import com.lagou.edu.pojo.A;
import com.lagou.edu.pojo.B;
import com.lagou.edu.utils.ConnectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author 应癫
 */
@Repository
@Lazy
public class BaseDaoImpl<T> implements IBaseDao<T> {


    @Autowired
    private ConnectionUtils connectionUtils;


    private Class clazz = null ; // 赋值为子类传递过来的泛型类型

    // 父Bean中在获取子Bean传递过来的泛型类型的时候，只有获取到具体的泛型类型比如A，B等，才能针对性的查询某张表
    // 需要父Bean延迟加载，否则会异常

    public BaseDaoImpl(){
        // 此处this指子类
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        // 转换为参数化类型
        ParameterizedType parameterizedType = (ParameterizedType)genericSuperclass;
        clazz = (Class) parameterizedType.getActualTypeArguments()[0];
    }



    @Override
    public T queryById(int id) throws Exception {
        // 公共代码抽取放在这里
        Connection con = connectionUtils.getCurrentThreadConn();
        // com.lagou.xxx.
        String tableName = clazz.getName().split("\\.")[clazz.getName().split("\\.").length-1];  // 获取泛型名称 A
        String sql = "select * from " + tableName + " where id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();

        Object result = null;
        while(resultSet.next()) {
            if("A".equalsIgnoreCase(tableName)) {
                A a = new A();
                a.setId(resultSet.getInt("id"));
                a.setName(resultSet.getString("name"));
                result = a;
            }else if("B".equalsIgnoreCase(tableName)) {
                B b = new B();
                b.setId(resultSet.getInt("id"));
                b.setXingming(resultSet.getString("xingming"));
                result = b;
            }

        }

        resultSet.close();
        preparedStatement.close();
        //con.close();
        return (T) result;
    }
}
