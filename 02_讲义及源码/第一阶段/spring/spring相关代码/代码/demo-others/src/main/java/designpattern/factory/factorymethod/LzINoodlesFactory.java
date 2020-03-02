package designpattern.factory.factorymethod;


import designpattern.factory.simplefactory.noodles.INoodles;
import designpattern.factory.simplefactory.noodles.LzNoodles;

public class LzINoodlesFactory implements INoodlesFactory {
    @Override
    public INoodles createNoodles() {
        return new LzNoodles();
    }
}
