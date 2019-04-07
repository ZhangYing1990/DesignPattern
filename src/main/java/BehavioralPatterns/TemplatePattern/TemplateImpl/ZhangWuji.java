package BehavioralPatterns.TemplatePattern.TemplateImpl;

import BehavioralPatterns.TemplatePattern.Template;

public class ZhangWuji extends Template {

    public ZhangWuji(String name) {
        super(name);
    }

    public void zhaoshi() {
        System.out.println(name + "招式适用七伤拳");
    }

    public void neigong() {
        System.out.println(name + "内功使用用九阳神功");
    }

    @Override
    public boolean hasWeapon(){
        return false;
    }
}
