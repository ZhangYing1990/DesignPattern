package CreatorPatterns.Factory.FacotryImpl;

import CreatorPatterns.Factory.Compute;
import CreatorPatterns.Factory.ComputeFactory;

/**
 * 工厂方法模式的 具体工厂
 */
public class ConcreteComputeFactory implements ComputeFactory {

    public <T extends Compute> T createCompute(Class T) throws Exception {
        String className = T.getName();
        try {
            return (T) Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
