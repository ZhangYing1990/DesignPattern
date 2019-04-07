package CreatorPatterns.Builder;

/**
 * 构建者模式的指挥者；调用Builder的接口
 * 产品的构建算法；独立于产品的组成，以及各组成的装配方法
 */
public class Director {

    public void construct(Builder builder){
        builder.buildCpu();
        builder.buildMemory();
        builder.buildOther();
    }
}
