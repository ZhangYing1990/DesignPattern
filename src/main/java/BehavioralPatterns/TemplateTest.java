package BehavioralPatterns;

import BehavioralPatterns.TemplatePattern.Template;
import BehavioralPatterns.TemplatePattern.TemplateImpl.ZhangSanFeng;
import BehavioralPatterns.TemplatePattern.TemplateImpl.ZhangWuji;

/**
 * 模版模式
 *
 * 使用场景
 * 1，各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
 * 2，面对重要复杂的算法，可以把核心算法设计为模版方法，周边相关细节功能则有各个子类实现。
 * 3，需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制。
 *
 * 优点
 * 1，模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。
 * 2，子类实现算法的某些细节，有助于算法的扩展。
 *
 * 缺点
 * 1，每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
 *
 */
public class TemplateTest {

    public static void main(String[] args){
        Template template = new ZhangWuji("张无忌");
        template.fighting();


        Template template1 = new ZhangSanFeng("张三丰");
        template1.fighting();

    }

}
