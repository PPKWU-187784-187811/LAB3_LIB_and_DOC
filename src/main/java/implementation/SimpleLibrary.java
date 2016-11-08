package implementation;

import interfaces.ICallback;
import interfaces.ILibrary;
import utils.Const;

import java.io.*;

import static java.awt.SystemColor.text;
import static utils.Const.*;


/**
 * Created by Adam Piech on 2016-11-08.
 */
public class SimpleLibrary implements ILibrary {

    @Override
    public String readFile(String file, ICallback callback) {
        BufferedReader buffer = null;
        String results = null;
        String line = null;

        try {
            buffer = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            doProgress(callback);
            while ((line = buffer.readLine()) != null) {
                builder.append(line + System.lineSeparator());
            }
            results = builder.toString();
        } catch (IOException e) {
            callback.getResult(Const.FAILURE);
        }

        callback.getResult(Const.SUCCESS);
        return results;
    }

    @Override
    public void writeFile(String file, String text, ICallback callback) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.write(TEXT_TO_SAVE);
            doProgress(callback);
            callback.getResult(Const.SUCCESS);
        } catch (IOException exception) {
            callback.getResult(Const.FAILURE);
        }

    }

    private void doProgress(ICallback callback) {
        for (int index = 0; index < 100; index = index + 10) {
            callback.getResult(PROGRESS + index + PERCENT);
            delay(index * 10);
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
