package com.company;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        loadFile("f");
    }

    static void loadFile(String fileName) throws IOException {
        Path file = FileSystems.getDefault().getPath("",fileName);
        List<String> lines = Files.readAllLines(file);
        lines.forEach( System.out::println);

    }

}
