package CreatorPatterns.Factory.ComputeImpl.NotepadComputeImpl;

import CreatorPatterns.Factory.ComputeImpl.NotepadCompute;

public class HtcNotepadCompute extends NotepadCompute {

    public void start(){
        super.start();
        System.out.println("htc start...");
    }
    public void touch() {
        System.out.println("htc notepad touch...");
    }
}
