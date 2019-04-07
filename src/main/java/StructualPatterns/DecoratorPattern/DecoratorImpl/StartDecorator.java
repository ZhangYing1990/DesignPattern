package StructualPatterns.DecoratorPattern.DecoratorImpl;

import StructualPatterns.DecoratorPattern.ComputorComponent;
import StructualPatterns.DecoratorPattern.Decorator;

public class StartDecorator extends Decorator {

    public StartDecorator(ComputorComponent computorComponent) {
        super(computorComponent);
    }

    public void showPicture(){
        System.out.println("显示启动图片");
    }

    @Override
    public void start(){
        showPicture();
        super.start();
    }
}
