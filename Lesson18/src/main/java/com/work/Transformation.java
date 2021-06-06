package com.work;

import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.List;
import java.util.Map;

public class Transformation {

    public static void fromJson(File file) {
        Gson gson = new Gson();
        Yaml yaml = new Yaml();
        char s = 0;
        try (FileReader fr = new FileReader(file)) {
            s = (char) fr.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(file.toString().split("\\.json")[0] + ".yaml")){
            if (s == '{') {
                Map map = gson.fromJson(fr, Map.class);
                fw.write(yaml.dump(map));
            } else {
                Map[] map = gson.fromJson(fr, Map[].class);
                fw.write(yaml.dump(map));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        file.delete();
    }

    public static void fromYaml(File file) {
        Yaml yaml = new Yaml();
        Gson gson = new Gson();
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(file.toString().split("\\.yaml")[0] + ".json")){
            Map<String, Object> obj = yaml.load(fr);
            fw.write(gson.toJson(obj));
        } catch (ClassCastException er){
            try (FileReader fr = new FileReader(file);
                 FileWriter fw = new FileWriter(file.toString().split("\\.yaml")[0] + ".json", true)){
                List<Map> list = yaml.load(fr);
                fw.write(gson.toJson(list));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        file.delete();
    }
}