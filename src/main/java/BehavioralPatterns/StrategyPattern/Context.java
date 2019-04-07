package BehavioralPatterns.StrategyPattern;

public class Context {

    private Strategy strategy ;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void fighting(){
        strategy.fighting();
    }
}
