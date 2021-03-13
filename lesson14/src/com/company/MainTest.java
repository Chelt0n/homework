package com.company;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void expectedTrueArray() {
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] result = Main.outElementsFromArray(array, 4);
        assertArrayEquals(result, new int[]{1, 7});

    }

    @Test
    void runtimeExceptionTest() {
        int[] array = {1, 2, 3};
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Main.outElementsFromArray(array, 0);
            }
        });

    }
    @Test
    void trueLength() {
        int[] array = {1, 2, 4, 4, 2, 3, 4};
        int[] result = Main.outElementsFromArray(array, 4);
        assertEquals(result.length, 0);

    }
    @ParameterizedTest
    @MethodSource("findOneORFour")
    void findOneORFour(int[] array, boolean expected){
        boolean result = Main.findOneORFour(array);
        Assertions.assertEquals(expected,result);
    }
    @Test
    private static Stream<Arguments> findOneORFour() {
        List<Arguments> arguments = new ArrayList<>();
        arguments.add(Arguments.arguments(new int[]{1, 1, 1, 1, 4, 4, 4, 4}, true));
        arguments.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}, false));
        arguments.add(Arguments.arguments(new int[]{4, 4, 4, 4 }, false));
        arguments.add(Arguments.arguments(new int[]{1, 4, 4, 1, 1, 4, 3 }, true));

        return arguments.stream();
    }



}