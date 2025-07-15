package com.bullet.io;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.bullet.utils.Print.print;


public class MyFileReader {

    public static List<String> readFile(String fileName) {
        Path path = Paths.get(fileName);
        List<String> lines;
        try {
            lines =  Files.readAllLines(path);
        } catch (IOException e) {
            print("Error reading from file");
            lines = new ArrayList<>();
        }
        return lines;
    }
}
