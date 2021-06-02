package com.work;

import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Transformation {

    public static void fromJson() {

        String json = "{ " +
                "'name': 'Alex Stepurko', " +
                "'java': true, " +
                "'age': 35, " +
                "'permission' : ['READ', 'WRITE', 'CREATE'], " +
                "'identifiers' : {'phone' : '123456', 'email' : alex@info.com}" +
                "}";

        Gson gson = new Gson();
        Map map = gson.fromJson(json, Map.class);

        System.out.println(map);

        Yaml yaml = new Yaml();

        Set<String> set = map.keySet();

//        for (String str : set) {
//            System.out.println("-----------------------");
//            System.out.print(str + " ... ");
//            System.out.println(map.get(str));
//            System.out.println(map.get(str).getClass());
//        }

//        String str = gson.toJson(map);
        try (FileWriter fw = new FileWriter(GetFiles.getFolder() + File.separator + "someName.yaml")) {
            fw.write(yaml.dump(map));
        } catch (IOException E) {
            System.out.println(E.getMessage());
        }
//        System.out.println(str);
    }

    public static void fromYaml() {
        Yaml yaml = new Yaml();
        String yamlStr = readToString("D:\\Codding\\HillelCourse\\Lesson18\\src\\main\\resources\\random_genereted.yaml");
        Map<String, Object> obj = yaml.load(yamlStr);

        Gson gson = new Gson();
        Map map = gson.fromJson(obj.toString(), Map.class);
        String str = gson.toJson(map);

        try (FileWriter fw = new FileWriter(GetFiles.getFolder() + File.separator + "someName.json", true)) {
            fw.write(str);
        } catch (IOException E) {
            System.out.println(E.getMessage());
        }


//        System.out.println(yaml.dump(obj));


//        String json = "{ " +
//                "'name': 'Alex Stepurko', " +
//                "'java': true, " +
//                "'age': 35, " +
//                "'permission' : ['READ', 'WRITE', 'CREATE'], " +
//                "'identifiers' : {'phone' : '123456', 'email' : alex@info.com}" +
//                "}";


//        Map map = gson.fromJson(yamlStr, Map.class);

//        System.out.println(map);

//        Set<String> set = map.keySet();

//        for (String str : set) {
//            System.out.println("-----------------------");
//            System.out.print(str + " ... ");
//            System.out.println(map.get(str));
//            System.out.println(map.get(str).getClass());
//        }

//        String str = gson.toJson(map);
//        System.out.println(str);
    }

    public static String readToString(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}