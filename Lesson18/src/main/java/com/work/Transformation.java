package com.work;

import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Transformation {

    public static void fromJson(File file) {

        Gson gson = new Gson();
        Yaml yaml = new Yaml();
        char s = 0;
        try {
            s = (char) new FileReader(file).read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(file);
             FileWriter fw = new FileWriter(GetFiles.getFolder() + File.separator + "someNameAnother.yaml")){
            if (s == '{') {
                Map map = gson.fromJson(fr, Map.class);
                fw.write(yaml.dump(map));
                System.out.println(map);

            } else {
                Map[] map = gson.fromJson(fr, Map[].class);
                fw.write(yaml.dump(map));
                System.out.println(Arrays.toString(map));
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
             FileWriter fw = new FileWriter(GetFiles.getFolder() + File.separator + "someNameAnother.json")){
            Map<String, Object> obj = yaml.load(fr);
            fw.write(gson.toJson(obj));
        } catch (ClassCastException er){
            try (FileReader fr = new FileReader(file);
                 FileWriter fw = new FileWriter(GetFiles.getFolder() + File.separator + "someNameAnother.json", true)){
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

//    public static String readToString(String filePath) {
//        StringBuilder contentBuilder = new StringBuilder();
//        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) {
//            stream.forEach(s -> contentBuilder.append(s).append("\n"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return contentBuilder.toString();
//    }
}