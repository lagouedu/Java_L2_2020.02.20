package designpattern.proxy.dynamicproxy;

import designpattern.proxy.dynamicproxy.IRentingHouse;

/**
 * 委托方（委托对象）
 */
public class RentingHouseImpl implements IRentingHouse {
    @Override
    public void rentHosue() {
        System.out.println("我要租用一室一厅的房子");
    }
}