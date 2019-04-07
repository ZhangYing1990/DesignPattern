package CreatorPatterns.Factory;

/**
 * 工厂方法模式 工厂接口
 */
public interface ComputeFactory {
    public <T extends Compute> T createCompute(Class T) throws Exception;
}