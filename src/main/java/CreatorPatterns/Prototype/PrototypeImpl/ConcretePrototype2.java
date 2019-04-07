package CreatorPatterns.Prototype.PrototypeImpl;

import CreatorPatterns.Prototype.PrototypeObject;

import java.util.Arrays;
import java.util.List;

/**
 * 原型的具体类
 * 深拷贝 但属性为浅拷贝
 *
 * 两种方式：
 * extends PrototypeObject 抽象类，可增加公共参数
 * implements Cloneable 接口，需要实现对象的clone方法，实现了Cloneable接口却没有重写clone方法就会报错
 */
public class ConcretePrototype2 extends PrototypeObject {

    private List<String> conStr;

    public List<String> getConStr() {
        return conStr;
    }

    public void setConStr(List<String> conStr) {
        this.conStr = conStr;
    }

    public ConcretePrototype2(String conId, String id){
        setId(id);
        this.conStr = Arrays.asList(conId);
    }

    public ConcretePrototype2(List<String> conIds, String id){
        setId(id);
        this.conStr = conIds;
    }

    /*
     * 错误的理解： 原型模式是重写cloneable接口的clone方法，实用内存的二进制流复制对象，避免实用构造方法初始化对象的低效。
     * @return
    public PrototypeObject clone() {
        return new ConcretePrototype2(this.conStr, this.getId());
    }
    */


    // 浅拷贝
    @Override
    public PrototypeObject clone(){
        return super.clone();
    }

}
