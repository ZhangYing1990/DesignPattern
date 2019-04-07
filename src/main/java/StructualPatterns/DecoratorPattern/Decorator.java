package StructualPatterns.DecoratorPattern;

public class Decorator implements ComputorComponent{

    private ComputorComponent computorComponent;

    public Decorator(ComputorComponent computorComponent){
        this.computorComponent = computorComponent;
    }

    public void start() {
        computorComponent.start();
    }
}
