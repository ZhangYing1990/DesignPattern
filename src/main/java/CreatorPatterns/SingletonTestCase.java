package CreatorPatterns;

import CreatorPatterns.Singleton.SingletonObject;
import CreatorPatterns.Singleton.SingletonObject2;

/**
 * 单例模式： https://blog.csdn.net/itachi85/article/details/50510124
 */
public class SingletonTestCase {

    public static void main(String[] args){
        testSingleton1();
        testSingleton2();
    }

    private static void testSingleton1(){
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                SingletonObject singletonObject = SingletonObject.getInstance();
                System.out.println(singletonObject);
                System.out.println(Thread.currentThread().getName());
            }
        }, "thread-1");
        thread1.run();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                SingletonObject singletonObject = SingletonObject.getInstance();
                System.out.println(singletonObject);
                System.out.println(Thread.currentThread().getName());
            }
        },"thread-2");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                SingletonObject singletonObject = SingletonObject.getInstance();
                System.out.println(singletonObject);
                System.out.println(Thread.currentThread().getName());
            }
        },"thread-3");
        thread3.start();
    }


    private static void testSingleton2(){
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                SingletonObject2 singletonObject = SingletonObject2.getInstance();
                System.out.println(singletonObject);
                System.out.println(Thread.currentThread().getName());
            }
        }, "thread-1");
        thread1.run();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                SingletonObject2 singletonObject = SingletonObject2.getInstance();
                System.out.println(singletonObject);
                System.out.println(Thread.currentThread().getName());
            }
        },"thread-2");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                SingletonObject2 singletonObject = SingletonObject2.getInstance();
                System.out.println(singletonObject);
                System.out.println(Thread.currentThread().getName());
            }
        },"thread-3");
        thread3.start();
    }

}
