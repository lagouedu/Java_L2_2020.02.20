package designpattern.proxy.staticproxy;

import designpattern.proxy.staticproxy.IRentingHouse;
import designpattern.proxy.staticproxy.RentingHouseImpl;
import designpattern.proxy.staticproxy.RentingHouseProxy;



public class Test {

    public static void main(String[] args) {
        IRentingHouse rentingHouse = new RentingHouseImpl();
        // 自己要租用一个一室一厅的房子
        // rentingHouse.rentHosue();



        RentingHouseProxy rentingHouseProxy = new RentingHouseProxy(rentingHouse);
        rentingHouseProxy.rentHosue();
    }
}
