package designpattern.factory.factorymethod;


import designpattern.factory.simplefactory.noodles.INoodles;

public class Test {
    public static void main(String[] args) {
        INoodlesFactory noodlesFactory = new LzINoodlesFactory();
        INoodles noodles = noodlesFactory.createNoodles();
        noodles.desc();
    }
}
