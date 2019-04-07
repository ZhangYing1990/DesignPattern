package BehavioralPatterns.TemplatePattern.TemplateImpl;

import BehavioralPatterns.TemplatePattern.Template;

public class ZhangSanFeng extends Template {
    public ZhangSanFeng(String name) {
        super(name);
    }

    public void zhaoshi() {
        System.out.println(name + "使用太极招式");
    }

    public void neigong() {
        System.out.println(name + "使用太极心法内功");
    }

    @Override
    public void weapon(){
        System.out.println(name + "使用太极剑");
    }
}
