package com.work;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class StreamsTest {

    @Test
    public void testAverage() {
        Assertions.assertEquals(2.0d, Streams.average(List.of(1, 2, 3)));
    }

    @Test
    public void testMaps() {
        Assertions.assertEquals(List.of("{mama:MAMA}", "{brother:BROTHER}", "{java:JAVA}", "{simple:SIMPLE}",
                                        "{trouble:TROUBLE}", "{world:WORLD}"),
                                         Streams.maps(List.of("Mama", "Brother", "java", "simple", "TROUBLE", "world")));
    }

    @Test
    public void testFiltred(){
        Assertions.assertEquals(List.of("java"),
                Streams.filtred(List.of("Mama", "Brother", "java", "simple", "TROUBLE", "world")));
    }

}