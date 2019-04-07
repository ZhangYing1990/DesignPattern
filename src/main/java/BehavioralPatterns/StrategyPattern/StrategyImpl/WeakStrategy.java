package BehavioralPatterns.StrategyPattern.StrategyImpl;

import BehavioralPatterns.StrategyPattern.Strategy;

public class WeakStrategy implements Strategy {

    public void fighting() {
        System.out.println("遇到弱对手，使用太极剑搏斗");
    }
}
