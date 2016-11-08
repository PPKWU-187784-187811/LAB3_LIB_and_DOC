package implementation;

import interfaces.ICallback;
import interfaces.ILibrary;

/**
 * Created by Adam Piech on 2016-11-08.
 */
public class SimpleLibrary implements ILibrary {

    @Override
    public String readFile(String file, ICallback callback) {
        return null;
    }
    @Override
    public void writeFile(String file, String text, ICallback callback) {

    }
}
