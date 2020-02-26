package com.lagou.edu.dao;

/**
 * @author 应癫
 */
public interface IBaseDao<T> {
    T queryById(int id) throws Exception;
}
