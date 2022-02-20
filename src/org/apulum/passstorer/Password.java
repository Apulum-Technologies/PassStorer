package org.apulum.passstorer;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import java.io.Serializable;
import java.io.File;

public final class Password implements Serializable {

    /*
    Holds the password, and is serialized with this instance
     */
    private String password;

    /*
    Creates a Password
     */
    public Password(@Nullable String password) {
        setPassword(password);
    }

    /*
    @return: A String that is "" if null has been passed into the constructor or the setPassword() method, otherwise the password as a String
     */
    public @NotNull String getPassword() {
        return password;
    }

    /*
    Sets the password instance variable to "" if "password" == null, sets it to "password" otherwise
    @param password: The password this object will hold
     */
    public void setPassword(@Nullable String password) {
        this.password = password == null ? "" : password;
    }

    /*
    Creates a random file with a random name (a random sequence of characters, not words)
    The folder this file belongs to must be Passstorer.PASSWORDS_FOLDER
     */
    public File createRandom() {
        return null;
    }

}
