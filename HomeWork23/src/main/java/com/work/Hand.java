package com.work;

public enum Hand {

    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private String title;

    Hand(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
