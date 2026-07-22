
package com.andrea.tablamultiplicar;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public int multiply(int n, int i) {
        return n * i;
    }

    public List<String> generateTable(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("the number cannot be negative");
        }
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int result = multiply(n, i);
            lines.add(n + " x " + i + " = " + result);
        }
        return lines;
    }

}