package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

public class FileRead {
    public static Queue fileRead() throws IOException {

        Queue<Integer> integerQueue = new PriorityQueue<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers.txt"));

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            integerQueue.offer(Integer.valueOf(line));
        }

        return integerQueue;
    }
}