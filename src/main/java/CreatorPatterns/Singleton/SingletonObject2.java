package CreatorPatterns.Singleton;

/**
 * 内部静态类实现单例模式，较SingletonObject更为推荐
 *
 * 静态内部类什么时候被加载？？
 */
public class SingletonObject2 {

    private SingletonObject2(){

    }

    public static SingletonObject2 getInstance(){
        return InternSingleton.singletonObject2;
    }

    private static class InternSingleton{
        private final static SingletonObject2 singletonObject2 = new SingletonObject2();
    }
}
