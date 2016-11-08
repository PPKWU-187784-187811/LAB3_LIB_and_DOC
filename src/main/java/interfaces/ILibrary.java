package interfaces;

/**
 * Created by Adam Piech on 2016-10-25.
 */
public interface ILibrary {

    public String readFile(String file, ICallback callback);

    public void writeFile(String file, String text, ICallback callback);

}
