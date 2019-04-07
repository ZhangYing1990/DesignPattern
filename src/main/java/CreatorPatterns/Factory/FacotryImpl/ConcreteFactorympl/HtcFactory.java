package CreatorPatterns.Factory.FacotryImpl.ConcreteFactorympl;


import CreatorPatterns.Factory.ComputeImpl.DesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.DesktopComputeImpl.HtcDesktopCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadCompute;
import CreatorPatterns.Factory.ComputeImpl.NotepadComputeImpl.HtcNotepadCompute;
import CreatorPatterns.Factory.FacotryImpl.AbstractFactory;

public class HtcFactory extends AbstractFactory {


    public DesktopCompute createDesktopCompute() {
        return new HtcDesktopCompute();
    }

    public NotepadCompute createNotepadCompute() {
        return new HtcNotepadCompute();
    }
}
