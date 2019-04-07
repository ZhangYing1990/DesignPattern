package BehavioralPatterns.ObserverPattern.ConcreteObserver;

import BehavioralPatterns.ObserverPattern.Observer;

/**
 *
 */
public class WeixinObserver implements Observer {
    private String name;

    public WeixinObserver(String name){
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "收到消息: " + message);
    }
}
