package designpattern.factory.simplefactory;

import designpattern.factory.simplefactory.noodles.INoodles;
import designpattern.factory.simplefactory.noodles.LzNoodles;

public class Test {

    public static void main(String[] args) {
        /**
         *  一开始，穷，想吃面必须得自己做
         *  想吃拉面得自己做，new LzNoodles()
         *  想吃泡面得自己做，new PaoNoodles()
         *  想吃热干面得自己做，new ReganNoodles()
         */
        // 做拉面吃
        INoodles lzNoodles = new LzNoodles();
        // 做泡面吃
        // INoodles paoNoodles = new PaoNoodles();
        // 做热干面吃
        // INoodles reganNoodles = new ReganNoodles();

        // 然而，new来new去，改来改去，好心烦......

        /**
         * 忽然，有一天走了狗屎运成了暴发户
         * 幸福生活从此来临，吃面从此变得简单
         * 给面馆说一声想吃啥，面馆做好了给自己就好了
         * 自己不必关心面条怎么做（怎么new，如何new）让面馆操心去吧（面馆帮我们new）！
         * 好省心，有钱就是好，太爽了！
         */
        INoodles iNoodles = SimpleNoodlesFactory.createNoodles(2);  // 和具体的对象脱离关系
        iNoodles.desc();

        /**考虑使用工厂模式
         * 1) 当客户程序不需要知道要使用对象的创建过程。
         * 2) 客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。
         */
    }
}
