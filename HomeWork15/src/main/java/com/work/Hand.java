package com.work;

import java.util.HashMap;
import java.util.Map;

public class Hand {

    public static final Map<Integer, String> hand = new HashMap<>();
    static {
        hand.put(0, "ROCK");
        hand.put(1, "PAPER");
        hand.put(2, "SCISSORS");
    }
}
