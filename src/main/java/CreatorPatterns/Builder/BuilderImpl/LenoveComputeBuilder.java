package CreatorPatterns.Builder.BuilderImpl;

import CreatorPatterns.Builder.Builder;
import CreatorPatterns.Builder.Compute;

/**
 * 具体构建者
 * 描述产品各组成的具体装配方法
 */
public class LenoveComputeBuilder extends Builder {

    public LenoveComputeBuilder(){
        compute = new Compute();
    }

    public void buildCpu() {
        compute.buildCpu("lenove cpu");
    }

    public void buildMemory() {
        compute.buildMemory("lenove memory");
    }

    public void buildOther() {
        compute.buildOther("lenove other");
    }
}
