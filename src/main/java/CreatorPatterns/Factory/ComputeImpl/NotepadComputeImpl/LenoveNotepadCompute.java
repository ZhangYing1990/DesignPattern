package CreatorPatterns.Factory.ComputeImpl.NotepadComputeImpl;

import CreatorPatterns.Factory.ComputeImpl.NotepadCompute;

public class LenoveNotepadCompute extends NotepadCompute {

    public void start(){
        super.start();
        System.out.println("leove start...");
    }

    public void touch() {
        System.out.println("lenove notepad touch...");
    }
}
