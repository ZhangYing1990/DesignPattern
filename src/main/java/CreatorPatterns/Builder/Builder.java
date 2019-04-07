package CreatorPatterns.Builder;

/**
 * 构建者 抽象类
 * 产品各组成的装配方法，抽象方法
 */
public abstract class Builder {

    protected Compute compute;

    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildOther();

    public Compute getCompute(){
        return compute;
    }
}
