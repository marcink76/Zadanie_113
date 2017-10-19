package pl.app;

import pl.app.io.FileRead;
import java.io.IOException;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        Queue queue;

        queue = FileRead.fileRead();
        NumberCounter.numberCounter(queue);
    }
}