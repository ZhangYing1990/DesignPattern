package CreatorPatterns.Prototype;

/**
 * 原型 抽象类
 */
public abstract class PrototypeObject implements Cloneable{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrototypeObject clone(){
        PrototypeObject prototypeObject = null;
        try {
            prototypeObject = (PrototypeObject) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototypeObject;
    }

}
