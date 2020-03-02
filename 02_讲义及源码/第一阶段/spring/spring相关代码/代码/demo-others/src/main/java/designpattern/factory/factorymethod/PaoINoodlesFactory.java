package designpattern.factory.factorymethod;


import designpattern.factory.simplefactory.noodles.INoodles;
import designpattern.factory.simplefactory.noodles.PaoNoodles;

public class PaoINoodlesFactory implements INoodlesFactory {
    @Override
    public INoodles createNoodles() {
        return new PaoNoodles();
    }
}
