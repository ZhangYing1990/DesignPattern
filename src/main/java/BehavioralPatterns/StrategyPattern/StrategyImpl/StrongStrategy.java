package BehavioralPatterns.StrategyPattern.StrategyImpl;

import BehavioralPatterns.StrategyPattern.Strategy;

public class StrongStrategy implements Strategy {

    public void fighting() {
        System.out.println("遇到强对手，使用乾坤大挪移搏斗");
    }
}
