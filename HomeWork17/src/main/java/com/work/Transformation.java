package com.work;

import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Transformation {

    static File log;
    static {
        try {
            log = new File(Paths.get(Main.class.getProtectionDomain().getCodeSource().
            getLocation().toURI()).getParent() + File.separator + "Log" + "_" + System.currentTimeMillis() + ".txt");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void fromJson(File file) {
        Gson gson = new Gson();
        Yaml yaml = new Yaml();
        long startTime = System.currentTimeMillis();
        long startValue = file.length();
        char s = 0;
        File converted = new File(file.getParent() + File.separator + "converted");
        if (!converted.exists()){
            converted.mkdir();
        }
        File newFile =  new File(converted + File.separator + file.getName().split("\\.json")[0] + ".yaml");
        try (FileReader fr = new FileReader(file)) {
            s = (char) fr.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(newFile)){
            if (s == '{') {
                Map map = gson.fromJson(fr, Map.class);
                fw.write(yaml.dump(map));
            } else {
                Map[] map = gson.fromJson(fr, Map[].class);
                fw.write(yaml.dump(map));
            }
        } catch (IOException e) {
            logging();
        }
        long endTime = System.currentTimeMillis();
        long endValue = newFile.length();
        logging(file, newFile, startTime, endTime, startValue, endValue);
    }

    public static void fromYaml(File file) {
        long startTime = System.currentTimeMillis();
        long startValue = file.length();
        Yaml yaml = new Yaml();
        Gson gson = new Gson();
        File converted = new File(file.getParent() + File.separator + "converted");
        if (!converted.exists()){
            converted.mkdir();
        }
        File newFile =  new File(converted + File.separator + file.getName().split("\\.yaml")[0] + ".json");
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(newFile)){
            Map<String, Object> obj = yaml.load(fr);
            fw.write(gson.toJson(obj));
        } catch (ClassCastException er){
            try (FileReader fr = new FileReader(file);
                 FileWriter fw = new FileWriter(newFile, true)){
                List<Map> list = yaml.load(fr);
                fw.write(gson.toJson(list));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            logging();
        }
        long endTime = System.currentTimeMillis();
        long endValue = newFile.length();
        logging(file, newFile, startTime, endTime, startValue, endValue);
    }

    public static void logging(File file, File newFile, long startTime, long endTime, long startValue, long endValue){
        long timeConverting = endTime - startTime;
        try (FileWriter fw = new FileWriter(log, true);){
            fw.write(file.getName() + " -> " + newFile.getName() + ", " + timeConverting + " millis, " +
                    startValue + " bytes" + " -> " + endValue + " bytes" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logging() {
        try (FileWriter fw = new FileWriter(log, true);){
            fw.write("файл не сконвертирован");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logging(int start) {
        try {
            log.createNewFile();
        } catch (Exception E) {
            System.out.println(E.getMessage());
        }
    }

    public static void transformationRun() {
        logging(1);
        GetFiles.getFiles().forEach(s -> {
            if (s.toString().endsWith(".json")){
                fromJson(s);
                System.out.println(s + " ready");
            } else if (s.toString().endsWith(".yaml")){
                fromYaml(s);
                System.out.println(s + " ready");
            }
        });
    }
}