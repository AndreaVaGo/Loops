package com.andrea.tablamultiplicar;

import java.util.List;

public class App {

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        List<String> result = table.generateTable(5);
        for (String line : result) {
            System.out.println(line);
        }
    }

}