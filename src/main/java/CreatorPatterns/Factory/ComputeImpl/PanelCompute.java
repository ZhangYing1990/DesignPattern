package CreatorPatterns.Factory.ComputeImpl;

import CreatorPatterns.Factory.Compute;

public abstract class PanelCompute implements Compute {

    public void start() {
        System.out.println("panel start...");
    }
}
