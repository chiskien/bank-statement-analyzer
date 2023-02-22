package org.chiskien;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionalAnalyzer {

    private static final String RESOURCES = "src/main/resources/data.csv";

    public static void main(String... args) throws IOException {
        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line : lines) {
            System.out.println(line);
        }
        System.out.println(path);
    }
}
