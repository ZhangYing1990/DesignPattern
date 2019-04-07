package CreatorPatterns.Factory.ComputeImpl;

import CreatorPatterns.Factory.Compute;

public abstract class NotepadCompute implements Compute {

    public void start(){
        System.out.println("notepad start...");
    }

    public abstract void touch();
}
