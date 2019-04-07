package CreatorPatterns.Builder.BuilderImpl;

import CreatorPatterns.Builder.Builder;
import CreatorPatterns.Builder.Compute;

/**
 * 具体构建者
 * 描述产品各组成的具体装配方法
 */
public class HtcComputeBuilder extends Builder {

    public HtcComputeBuilder(){
        compute = new Compute();
    }


    public void buildCpu() {
        compute.buildCpu("htc cpu");
    }

    public void buildMemory() {
        compute.buildMemory("htc memory");
    }

    public void buildOther() {
        compute.buildOther("htc other");
    }
}
