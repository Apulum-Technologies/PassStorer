package org.apulum.passstorer;

import javax.swing.*;
import java.awt.EventQueue;

public final class Launcher {

    private Launcher() {} // This class should never be instantiated

    private static Passstorer application;

    public static void launch() {

        EventQueue.invokeLater(() -> {

            UIManager.LookAndFeelInfo[] lookAndFeels = UIManager.getInstalledLookAndFeels();

            for(UIManager.LookAndFeelInfo info : lookAndFeels) {
                if(info.getClassName().contains("Nimbus")) {
                    try {
                        UIManager.setLookAndFeel(info.getClassName());
                    }
                    catch(UnsupportedLookAndFeelException e) {

                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        application = new Passstorer();
    }

    public static void main(String[]args) {
        launch();
    }

    public static Passstorer getApplication() {
        return application;
    }

}
