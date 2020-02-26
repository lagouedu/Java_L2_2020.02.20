package designpattern.factory.factorymethod;


import designpattern.factory.simplefactory.noodles.INoodles;
import designpattern.factory.simplefactory.noodles.ReganNoodles;

public class ReganINoodlesFactory implements INoodlesFactory {
    @Override
    public INoodles createNoodles() {
        return new ReganNoodles();
    }
}
