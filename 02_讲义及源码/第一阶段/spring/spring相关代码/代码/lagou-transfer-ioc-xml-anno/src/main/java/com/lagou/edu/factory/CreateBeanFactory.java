package com.lagou.edu.factory;

import com.lagou.edu.utils.ConnectionUtils;

/**
 * @author 应癫
 */
public class CreateBeanFactory {



    public static ConnectionUtils getInstanceStatic() {
        return new ConnectionUtils();
    }


    public ConnectionUtils getInstance() {
        return new ConnectionUtils();
    }
}
