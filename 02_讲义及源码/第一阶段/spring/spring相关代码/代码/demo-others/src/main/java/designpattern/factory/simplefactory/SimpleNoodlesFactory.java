package designpattern.factory.simplefactory;

import designpattern.factory.simplefactory.noodles.INoodles;
import designpattern.factory.simplefactory.noodles.LzNoodles;
import designpattern.factory.simplefactory.noodles.PaoNoodles;
import designpattern.factory.simplefactory.noodles.ReganNoodles;

/**
 * 简单工厂模式
 * 一家“简单面馆”（简单工厂类）
 */
public class SimpleNoodlesFactory {

    public static final int TYPE_LZ = 1;//兰州拉面
    public static final int TYPE_PM = 2;//泡面
    public static final int TYPE_GK = 3;//热干面

    /**
     * 如果生产对象的方法是static的，这种简单工厂也叫做静态工厂
     * 如果生产对象的方法不是static的，这种简单工厂也叫做实例工厂
     * @param type
     * @return
     */
    public static INoodles createNoodles(int type) {
        switch (type) {
            case 1:
                return new LzNoodles();
            case 2:
                return new PaoNoodles();
            case 3:
                return new ReganNoodles();
            default:
                return new LzNoodles();
        }
    }
}