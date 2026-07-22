package com.andrea.tablamultiplicar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @ParameterizedTest
    @CsvSource({ "5, 3, 15", "2, 3, 6", "5, 5, 25", "0, 4, 0" })
    public void shouldCalculateMultiplication(int n, int i, int expected) {
        MultiplicationTable table = new MultiplicationTable();
        assertEquals(expected, table.multiply(n, i));
    }

    @Test
    public void shouldGenerateTable() {
        MultiplicationTable table = new MultiplicationTable();
        List<String> result = table.generateTable(5);
        assertEquals(10, result.size());
        assertEquals("5 x 3 = 15", result.get(2));

    }

    @ParameterizedTest
    @CsvSource({ "-1", "-5", "-100" })
    public void shouldThrowExceptionWhenNegative(int n) {
        MultiplicationTable table = new MultiplicationTable();
        assertThrows(IllegalArgumentException.class, () -> table.generateTable(n));
    }
}