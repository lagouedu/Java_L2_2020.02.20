package designpattern.factory.factorymethod;


import designpattern.factory.simplefactory.noodles.INoodles;

/**
 * 工厂方法模式
 */
public interface INoodlesFactory {
     INoodles createNoodles();
}