package com.work;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class GetFiles {

    public static Path getFolder(){
        Path path = null;
        try {
            path = Paths.get(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
        } catch (Exception E) {
            System.out.println(E.getMessage());
        }
        return path;
    }

    public static List<File> getFiles(){
        List<File> filesInFolder = null;
        try {
            filesInFolder = Files.walk(getFolder())
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filesInFolder;
    }



}
