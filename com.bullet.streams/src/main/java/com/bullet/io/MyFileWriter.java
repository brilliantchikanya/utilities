package com.bullet.io;


import java.io.*;

public class MyFileWriter {

    public static void write(String line, String filePath, boolean append) {
        File f = new File(filePath);

        try(FileWriter fw = new FileWriter(f, append);
            PrintWriter out = new PrintWriter(fw))
        {
            out.println(line);
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Could not append: " + filePath);
            System.out.println(e.getMessage());
        }
    }
}
