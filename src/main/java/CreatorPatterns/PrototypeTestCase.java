package CreatorPatterns;

import CreatorPatterns.Prototype.PrototypeImpl.ConcretePrototype1;
import CreatorPatterns.Prototype.PrototypeImpl.ConcretePrototype2;
import CreatorPatterns.Prototype.PrototypeImpl.ConcretePrototype3;
import CreatorPatterns.Prototype.PrototypeObject;

import java.util.Arrays;

/**
 * 原型模式
 * 动态获取对象的初始化
 */
public class PrototypeTestCase {

    public static void main(String[] args){
        PrototypeObject prototypeObject1 = new ConcretePrototype1("test2","test1");
        PrototypeObject prototypeObject2 = new ConcretePrototype2("test2","test1");
        PrototypeObject prototypeObject3 = new ConcretePrototype3("test3","test1");

        System.out.println(prototypeObject1.getId());
        System.out.println(((ConcretePrototype1) prototypeObject1).getConId());
        ConcretePrototype1 concretePrototype1 = (ConcretePrototype1)prototypeObject1.clone();
        concretePrototype1.setConId(Arrays.asList("test-test1"));
        System.out.println(((ConcretePrototype1) prototypeObject1).getConId());

        System.out.println(prototypeObject2.getId());
        System.out.println(((ConcretePrototype2) prototypeObject2).getConStr());
        ConcretePrototype2 concretePrototype2 = (ConcretePrototype2)prototypeObject2.clone();
        concretePrototype2.getConStr().set(0,"test-test2");
        System.out.println(((ConcretePrototype2) prototypeObject2).getConStr());
        concretePrototype2.setConStr(Arrays.asList("test-test3"));
        System.out.println(((ConcretePrototype2) prototypeObject2).getConStr());


        System.out.println(prototypeObject3.getId());
        System.out.println(((ConcretePrototype3) prototypeObject3).getConStr());
        ConcretePrototype3 concretePrototype3 = (ConcretePrototype3)prototypeObject3.clone();
        concretePrototype3.getConStr().set(0,"test-test-test2");
        System.out.println(((ConcretePrototype3) prototypeObject3).getConStr());
        concretePrototype3.setConStr(Arrays.asList("test-test-test3"));
        System.out.println(((ConcretePrototype3) prototypeObject3).getConStr());


    }
}
