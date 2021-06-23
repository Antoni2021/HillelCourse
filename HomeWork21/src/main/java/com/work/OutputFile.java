package com.work;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OutputFile {
/*
    public static void logToFile(String res) {
        Path base = getFolder();
        String dirName = base + File.separator + "log";
        File log = new File(dirName);
        log.mkdir();
        String fileName = dirName + File.separator + "log_" + Game.name + "_" +
                new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".txt";

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException E){
            Log.loggerError.error(E.getMessage());
//            System.out.println(E.getMessage());
        }

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(Game.count + " game: "  + res + "\n");
        } catch (IOException E) {
            Log.loggerError.error(E.getMessage());
//            System.out.println(E.getMessage());

        }
    }

    public static void resultToFile(String res) {
        Path path = getFolder();
        String dirName = path + File.separator + "result";
        File log = new File(dirName);
        log.mkdir();
        String fileName = dirName + File.separator + "result_" + Game.name + "_" +
                new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + ".txt";

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException E){
            Log.loggerError.error(E.getMessage());
//            System.out.println(E.getMessage());
        }

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(res);
        } catch (IOException E) {
            Log.loggerError.error(E.getMessage());
//            System.out.println(E.getMessage());
        }
    }

    public static Path getFolder(){
        Path path = null;
        try {
            path = Paths.get(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
        } catch (Exception E) {
            Log.loggerError.error(E.getMessage());
//            System.out.println(E.getMessage());
        }
        return path;
    }
*/
}
