package com.homeWork9;

import java.util.Objects;

public class Link {

    String link;
    Link next;
    Link prev;

    public Link(String link) {
        this.link = link;
    }

    public void displayLink() {
        System.out.print(link + " ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link1 = (Link) o;
        return Objects.equals(link, link1.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link);
    }
}
