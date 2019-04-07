package CreatorPatterns;

import CreatorPatterns.Factory.ComputeImpl.DesktopComputeImpl.HtcDesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.DesktopComputeImpl.LenoveDesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadComputeImpl.HtcNotepadCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadComputeImpl.LenoveNotepadCompute;
import CreatorPatterns.Factory.ComputeImpl.PanelComputeImpl.HtcPanelCompute;
import CreatorPatterns.Factory.ComputeImpl.PanelComputeImpl.LenovePanelCompute;
import CreatorPatterns.Factory.FacotryImpl.AbstractFactory;
import CreatorPatterns.Factory.FacotryImpl.ConcreteComputeFactory;
import CreatorPatterns.Factory.FacotryImpl.ConcreteFactorympl.HtcFactory;
import CreatorPatterns.Factory.FacotryImpl.ConcreteFactorympl.LenoveFactory;

/**
 * 抽象工厂 ＋ 工厂方法
 *
 * 简单工厂： https://blog.csdn.net/itachi85/article/details/50651177
 * 工厂方法： https://blog.csdn.net/itachi85/article/details/52326959
 * 抽象工厂： https://blog.csdn.net/itachi85/article/details/54755390
 *
 */
public class FactorTestCase {

    public static void main(String[] args) throws Exception{
        executorBaseFuction();
        executorComputeSpecialFuction();
    }


    /**
     * 工厂方法
     * 三类抽象产品：台式电脑（产品A）、笔记本电脑（产品B）、平板电脑（产品C）
     * 适用于三类抽象产品共有的基础方法
     * @throws Exception
     */
    public static void executorBaseFuction() throws Exception{
        ConcreteComputeFactory lenoveFactory = new ConcreteComputeFactory();
        lenoveFactory.createCompute(LenoveDesktopCompute.class).start();
        lenoveFactory.createCompute(LenoveNotepadCompute.class).start();
        lenoveFactory.createCompute(LenovePanelCompute.class).start();
        ConcreteComputeFactory htcFactory = new ConcreteComputeFactory();
        htcFactory.createCompute(HtcDesktopCompute.class).start();
        htcFactory.createCompute(HtcNotepadCompute.class).start();
        htcFactory.createCompute(HtcPanelCompute.class).start();
    }

    /**
     * 抽象工厂
     * 三类抽象产品：台式电脑（产品A）、笔记本电脑（产品B）、平板电脑（产品C）
     * 适用于三类抽象产品所特有的方法
     */
    public static void executorComputeSpecialFuction(){
        AbstractFactory lenoveFactory = new LenoveFactory();
        AbstractFactory htcFactory = new HtcFactory();
        lenoveFactory.createDesktopCompute().click();
        lenoveFactory.createNotepadCompute().touch();
        htcFactory.createDesktopCompute().click();
        htcFactory.createNotepadCompute().touch();
    }

}
