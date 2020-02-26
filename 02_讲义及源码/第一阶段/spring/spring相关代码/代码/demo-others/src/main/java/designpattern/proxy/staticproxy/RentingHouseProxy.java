package designpattern.proxy.staticproxy;

import designpattern.proxy.staticproxy.IRentingHouse;

public class RentingHouseProxy implements IRentingHouse {

    private IRentingHouse rentingHouse;

    public RentingHouseProxy(IRentingHouse rentingHouse) {
        this.rentingHouse = rentingHouse;
    }

    @Override
    public void rentHosue() {
        System.out.println("中介（代理）收取服务费3000元");
        rentingHouse.rentHosue();
        System.out.println("客户信息卖了3毛钱");
    }
}