package com.work;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        if (args.length != 0) { Locale.setDefault(new Locale(args[0].toLowerCase(Locale.ROOT)));}
        Game.start();
    }
}
