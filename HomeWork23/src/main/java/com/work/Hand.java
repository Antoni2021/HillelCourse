package com.work;

public enum Hand {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),;

    private String title;

    Hand(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
