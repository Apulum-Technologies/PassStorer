package org.apulum.passstorer;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.util.ArrayList;

public final class Passstorer {

    public static final String PASSWORDS_FOLDER = "";

    private ArrayList<Password> passwords;

    private Window window;

    public Passstorer() {
        init();
    }

    private void init() {
        initFileSystem();
        window = new Window("PassStorer");
    }

    private void initFileSystem() {
        final String userHome;


    }

    /*
    This method should delete the previously saved passwords, and then save the passwords in the "passwords" instance variable
     */
    private void save(Password... passwords) throws IOException {
        for(Password p : passwords) {
            ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(p.createRandom())));
            outputStream.writeObject(p);
        }
    }

    /*
    This method should load the previously saved Passwords into the instance variable passwords
     */
    private ArrayList<Password> load() {
        return new ArrayList<>();
    }



}
