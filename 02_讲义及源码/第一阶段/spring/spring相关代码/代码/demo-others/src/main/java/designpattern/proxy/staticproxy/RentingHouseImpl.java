package designpattern.proxy.staticproxy;

import designpattern.proxy.staticproxy.IRentingHouse;

public class RentingHouseImpl implements IRentingHouse {
    @Override
    public void rentHosue() {
        System.out.println("我要租用一室一厅的房子");
    }
}