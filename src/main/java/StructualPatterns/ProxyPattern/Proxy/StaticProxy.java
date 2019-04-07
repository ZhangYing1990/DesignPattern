package StructualPatterns.ProxyPattern.Proxy;

import StructualPatterns.ProxyPattern.IShop;

/**
 *
 */
public class StaticProxy implements IShop {

    private IShop iShop;

    public StaticProxy(IShop iShop){
        this.iShop = iShop;
    }

    // 静态代理
    public void buy() {
        iShop.buy();
    }
}
