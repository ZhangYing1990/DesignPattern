package CreatorPatterns.Factory.FacotryImpl.ConcreteFactorympl;

import CreatorPatterns.Factory.ComputeImpl.DesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.DesktopComputeImpl.LenoveDesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadComputeImpl.LenoveNotepadCompute;
import CreatorPatterns.Factory.FacotryImpl.AbstractFactory;

public class LenoveFactory extends AbstractFactory {

    public DesktopCompute createDesktopCompute() {
        return new LenoveDesktopCompute();
    }

    public NotepadCompute createNotepadCompute() {
        return new LenoveNotepadCompute();
    }
}
