package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Path path = Paths.get("file.txt");
        String [] str = new String[]{"Hello world!!!", "Hello Java!!!"};
            try {
                Files.write(path, Arrays.asList(str));
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
