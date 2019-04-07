package CreatorPatterns;

import CreatorPatterns.Builder.Builder;
import CreatorPatterns.Builder.BuilderImpl.HtcComputeBuilder;
import CreatorPatterns.Builder.BuilderImpl.LenoveComputeBuilder;
import CreatorPatterns.Builder.Director;

/**
 * 构建者模式的 Client
 */
public class BuilderTestCase {

    public static void main(String[] args){
        Director director = new Director();

        Builder lenoveComputeBuilder = new LenoveComputeBuilder();
        director.construct(lenoveComputeBuilder);
        String lenoveResourceInfo = lenoveComputeBuilder.getCompute().getComputeInfo();
        System.out.println(lenoveResourceInfo);

        Builder htcComputeBuilder = new HtcComputeBuilder();
        director.construct(htcComputeBuilder);
        String htcResourceInfo = htcComputeBuilder.getCompute().getComputeInfo();
        System.out.println(htcResourceInfo);

    }
}
