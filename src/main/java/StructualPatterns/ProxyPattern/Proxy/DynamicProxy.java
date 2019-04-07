package StructualPatterns.ProxyPattern.Proxy;

import StructualPatterns.ProxyPattern.IShop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private IShop shop;

    public DynamicProxy(IShop shop){
        this.shop = shop;
    }

    // 动态代理
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(shop,args);
    }
}
