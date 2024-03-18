package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final String FILE_PATH = "log.txt";

    public static void log(String message) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = dateFormat.format(new Date());
            FileWriter writer = new FileWriter(FILE_PATH, true);
            writer.write(formattedDateTime + " - " + message + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}