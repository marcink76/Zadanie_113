package pl.app;

import java.util.Collections;
import java.util.Locale;
import java.util.Queue;

public class NumberCounter {
    public static void numberCounter(Queue queue) {

        for (int i = 0; i < queue.size(); i++) {
            int temp = Collections.frequency(queue, i);
            if (temp != 0){
                System.out.printf(Locale.ROOT, "Liczba %d występuje %d razy\n", i, temp);
            }
        }
    }
}