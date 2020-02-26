package designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 应癫
 */
public class JdkProxy {

    public static void main(String[] args) {

        IRentingHouse rentingHouse = new RentingHouseImpl();  // 委托对象---委托方

        // 从代理对象工厂获取代理对象
        IRentingHouse jdkProxy = (IRentingHouse) ProxyFactory.getInstance().getJdkProxy(rentingHouse);

        jdkProxy.rentHosue();


    }
}
