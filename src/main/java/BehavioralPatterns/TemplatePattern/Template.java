package BehavioralPatterns.TemplatePattern;

public abstract class Template {

    protected String name ;

    public Template(String name) {
        this.name = name;
    }

    public void fighting(){
        jingmai();
        neigong();
        zhaoshi();
        if(hasWeapon()){
            weapon();
        }
    }

    public void jingmai(){
        System.out.println(name + "打通经脉");
    }
    public abstract void zhaoshi();
    public abstract void neigong();
    public boolean hasWeapon(){
        return true;
    }
    public void weapon(){

    }
}
