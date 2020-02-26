package com.lagou.edu.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author 应癫
 */

public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}
