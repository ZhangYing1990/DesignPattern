package BehavioralPatterns;

import BehavioralPatterns.ObserverPattern.ConcreteObserver.WeixinObserver;
import BehavioralPatterns.ObserverPattern.ConcreteSubject.WeixinSubject;
import BehavioralPatterns.ObserverPattern.Observer;
import BehavioralPatterns.ObserverPattern.Subject;

public class ObserverTest {

    public static void main(String[] args){
        Subject subject = new WeixinSubject();
        Observer observer1 = new WeixinObserver("张俊梅");
        Observer observer2 = new WeixinObserver("孙志远");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.notify("消息更新：观察者设计模式深究");

    }
}
