package implementation;

import interfaces.ICallback;
import interfaces.ILibrary;
import utils.Const;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import static utils.Const.*;


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
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.write(TEXT_TO_SAVE);
            for (int index = 0; index < 100; index = index + 10) {
                callback.getResult(PROGRESS + index + PERCENT);
                delay(index * 10);
            }
            callback.getResult(Const.SUCCESS);
        } catch (IOException exception) {
            callback.getResult(Const.FAILURE);
        }

    }

    private void delay(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
