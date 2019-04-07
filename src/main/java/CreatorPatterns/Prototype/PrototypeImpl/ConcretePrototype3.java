package CreatorPatterns.Prototype.PrototypeImpl;

import CreatorPatterns.Prototype.PrototypeObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 原型的具体类
 * 深拷贝 属性也为深拷贝
 *
 * 两种方式：
 * extends PrototypeObject 抽象类，可增加公共参数
 * implements Cloneable 接口，需要实现对象的clone方法，实现了Cloneable接口却没有重写clone方法就会报错
 */
public class ConcretePrototype3 extends PrototypeObject {

    private List<String> conStr;

    public List<String> getConStr() {
        return conStr;
    }

    public void setConStr(List<String> conStr) {
        this.conStr = conStr;
    }

    public ConcretePrototype3(String conId, String id){
        setId(id);
        this.conStr = Arrays.asList(conId);
    }

    public ConcretePrototype3(List<String> conIds, String id){
        setId(id);
        this.conStr = new ArrayList<String>(conIds);
    }

    /**
     * 错误的理解： 原型模式是重写cloneable接口的clone方法，实用内存的二进制流复制对象，避免实用构造方法初始化对象的低效。
     * @return
     */
//    public PrototypeObject clone() {
//        return new ConcretePrototype3(this.conStr, this.getId());
//    }

    @Override
    public PrototypeObject clone(){
        ConcretePrototype3 concretePrototype3 = (ConcretePrototype3) super.clone();
        concretePrototype3.conStr =new ArrayList<String>(concretePrototype3.getConStr()); // 深拷贝
        return concretePrototype3;
    }
}
