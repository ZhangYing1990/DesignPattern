package CreatorPatterns.Prototype.PrototypeImpl;

import CreatorPatterns.Prototype.PrototypeObject;

import java.util.Arrays;
import java.util.List;

/**
 * 原型的具体类
 * 浅拷贝
 *
 * 两种方式：
 * extends PrototypeObject 抽象类，可增加公共参数
 * implements Cloneable 接口，需要实现对象的clone方法，实现了Cloneable接口却没有重写clone方法就会报错
 */
public class ConcretePrototype1 extends PrototypeObject {

    private List<String> conId;

    public List<String> getConId() {
        return conId;
    }

    public void setConId(List<String> conId) {
        this.conId = conId;
    }

    public ConcretePrototype1(String conId, String id){
        setId(id);
        this.conId = Arrays.asList(conId);
    }

    public ConcretePrototype1(List<String> conIds, String id){
        setId(id);
        this.conId = conIds;
    }

    @Override
    public PrototypeObject clone() {
        return this;
    }
}
