package com.work;

public class Main {
    public static void main(String[] args) {

        System.out.println(GetFiles.getFiles());

        GetFiles.getFiles().forEach(s -> {
            if (s.toString().endsWith(".json")){
                Transformation.fromJson(s);
                System.out.println(s + " ready");
            } else if (s.toString().endsWith(".yaml")){
                Transformation.fromYaml(s);
                System.out.println(s + " ready");
            }
        });
    }
}
