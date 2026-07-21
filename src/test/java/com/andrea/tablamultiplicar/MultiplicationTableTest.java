package com.andrea.tablamultiplicar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTableTest {

    @ParameterizedTest
    @CsvSource({ "5, 3, 15", "2, 3, 6", "5, 5, 25", "0, 4, 0" })
    public void shouldCalculateMultiplication(int n, int i, int expected) {
        MultiplicationTable table = new MultiplicationTable();
        assertEquals(expected, table.multiply(n, i));
    }

}