package CreatorPatterns.Factory.ComputeImpl.DesktopComputeImpl;

import CreatorPatterns.Factory.ComputeImpl.DesktopCompute;

public class LenoveDesktopCompute extends DesktopCompute {

    public void start(){
        super.start();
        System.out.println("lenove start...");
    }

    public void click() {
        System.out.println("lenove desktop click...");
    }
}
