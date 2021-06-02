package com.work;

import java.nio.file.Path;
import java.nio.file.Paths;

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
}
