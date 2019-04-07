package BehavioralPatterns.ObserverPattern.ConcreteSubject;

import BehavioralPatterns.ObserverPattern.Observer;
import BehavioralPatterns.ObserverPattern.Subject;

import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class WeixinSubject implements Subject {

    private List<Observer> observerList = new LinkedList<Observer>();

    public void attach(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    public void detach(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }

    }

    public void notify(String message) {
        for(Observer observer: observerList){
            observer.update(message);
        }
    }
}
