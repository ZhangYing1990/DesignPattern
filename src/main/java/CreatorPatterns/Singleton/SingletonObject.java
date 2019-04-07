package CreatorPatterns.Singleton;

/**
 * 双重检查实现单例模式。
 * 特点：线程安全，减少不必要的同步等待
 */
public class SingletonObject {

    /**
     * 此处的volatile对线程安全是必要的。
     * 详见并发编程之 volatile：https://blog.csdn.net/itachi85/article/details/50274169
     */
    private static volatile SingletonObject singletonObject ;

    private SingletonObject(){

    }

    // DCL 双重检查，线程安全
    public static SingletonObject getInstance(){
        if(singletonObject == null){
            synchronized (SingletonObject.class){
                if(singletonObject == null){
                    singletonObject = new SingletonObject();
                }
            }
        }
        return singletonObject;
    }
}
