package CreatorPatterns.Factory.ComputeImpl.DesktopComputeImpl;

import CreatorPatterns.Factory.ComputeImpl.DesktopCompute;

public class HtcDesktopCompute extends DesktopCompute {

    public void start(){
        super.start();
        System.out.println("htc start...");
    }
    public void click() {
        System.out.println("htc desktop click...");
    }
}
