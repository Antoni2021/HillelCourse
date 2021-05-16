package com.work;

import javafx.util.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StreamsTest {

    @Test
    public void testAverage() {
        Assertions.assertEquals(2.0d, Streams.average(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void testMaps() {
        Assertions.assertEquals(Arrays.asList(new Pair<>("mama", "MAMA"),
                       new Pair<>("brother", "BROTHER"), new Pair<>("java", "JAVA"),
                       new Pair<>("simple", "SIMPLE"), new Pair<>("trouble", "TROUBLE"),
                        new Pair<>("world", "WORLD")),
                Streams.maps(Arrays.asList("Mama", "Brother", "java", "simple", "TROUBLE", "world")));
    }

    @Test
    public void testFiltred(){
        Assertions.assertEquals(Arrays.asList("java"),
                Streams.filtred(Arrays.asList("Mama", "Brother", "java", "simple", "TROUBLE", "world")));
    }

}