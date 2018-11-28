package com.cisco.learning.six;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class FileSystemsExamples {

    public static void main(String[] args) {
        displayHomeFolderPath();

        //fileWalkingExample();

        //readAllFileLines();

        //usingSystemProperties();
    }

    private static void displayHomeFolderPath() {
        Path path = Paths.get(System.getProperty("user.home")); // var-args
        System.out.println(path.toFile().getAbsolutePath());
        System.out.println(path.getParent().toFile().getAbsolutePath());
    }

    private static void fileWalkingExample() {
        try {                                                               // anonymous class
            Files.walkFileTree(Paths.get(System.getProperty("user.dir")), new FileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println("file: " + file.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    System.out.println("folder: " + dir.getFileName());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllFileLines() {
        try {
            final List<String> strings = Files.readAllLines(Paths.get("first_file.txt"));
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void usingSystemProperties() {
        final Properties properties = System.getProperties();
        final Enumeration<?> enumeration = properties.keys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement().toString();
            if (key.contains("user")) {
                System.out.println(key + " -> " + properties.getProperty(key));
            }
        }

        System.setProperty("cisco", "rules");
        System.out.println(System.getProperty("cisco"));

        System.out.println("Congratulations Bogdan for " + System.getProperty("bogdan"));
    }
}
