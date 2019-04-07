package StructualPatterns;

import StructualPatterns.ProxyPattern.IShop;
import StructualPatterns.ProxyPattern.IShop2;
import StructualPatterns.ProxyPattern.Proxy.DynamicProxy;
import StructualPatterns.ProxyPattern.Proxy.StaticProxy;
import StructualPatterns.ProxyPattern.ShopImpl.ZjmShop;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 *
 * 静态代理
 *
 * 动态代理：动态生成代理类，代理类有一个InvocationHandler类型的属性，实现 Class[]（Proxy.newProxyInstance的第二个参数） 指定的多个接口，
 *          并实现接口方法定义，方法调用都会触发InvocationHandler属性的invoke方法调用；
 *          有一个InvocationHandler类型入参的构造方法；用ClassLoader（Proxy.newProxyInstance的第一个参数）定义动态代理类；
 *          用InvocationHandler的实现类对象（Proxy.newProxyInstance的第三个参数）初始化动态代理类生成动态代理对象。
 *          所有动态代理对象上触发的方法，都会转向调用InvocationHandler的实现类对象的invoke方法，进而转向调用实际代理对象的方法。
 *
 *          通过InvocationHandler的实现类定义invoke方法（核心需要转向调用实际代理对象的方法），定制化代理事务。
 *
 *          AOP通过代理原理实现。
 *
 *          动态代理类的字节吗生成详见 ProxyGenerator.class
 *
 */
public class ProxyTest {

    public static void main(String[] args) throws Throwable{

//      决定动态代理类字节码是否持久化 ； 详见 ProxyGenerator.class文件
//      System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        IShop shop = new ZjmShop();

        StaticProxy staticProxy = new StaticProxy(shop);

        staticProxy.buy();

        // 动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(new ZjmShop());
        /**
         *  第二个参数 为代理类实现的接口
         *  ??? classloader 与 class 之间的关系？ 第一个参数是 定义代理类的classsloader，与第二个参数的关系？？
         */
        IShop shop2 = (IShop) Proxy.newProxyInstance(IShop2.class.getClassLoader(), new Class[]{IShop.class, IShop2.class}, dynamicProxy);
        System.out.println(shop2.toString());
        shop2.buy();
    }
}
