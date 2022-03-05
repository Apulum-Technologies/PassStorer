package org.apulum.storer;

import java.awt.event.ActionEvent;
import java.io.File;

public final class Launcher {

    private static Launcher launcher;

    public static Launcher getLauncher() {
        return launcher == null ? launcher = new Launcher() : launcher;
    }

    private Launcher() {}

    public void launch() {
        initFileSystem();
        new Scene();
    }

    private void initFileSystem() {

    }

}
