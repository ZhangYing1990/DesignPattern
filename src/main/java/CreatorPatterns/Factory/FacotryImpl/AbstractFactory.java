package CreatorPatterns.Factory.FacotryImpl;

import CreatorPatterns.Factory.ComputeImpl.DesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadCompute;

/**
 * 抽象工厂模式的 抽象工厂
 */
public abstract class AbstractFactory extends ConcreteComputeFactory {

    public abstract DesktopCompute createDesktopCompute();

    public abstract NotepadCompute createNotepadCompute();
}
