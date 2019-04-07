package CreatorPatterns.Factory.ComputeImpl;

import CreatorPatterns.Factory.Compute;

public abstract class DesktopCompute implements Compute{

    public void start(){
        System.out.println("desktop start...");
    }

    public abstract void click();
}
