package com.cisco.learning.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuExample {

    public static void main(String[] args) {
        String option;
        do {
            option = readInput();
            switch (option) {
                case "read":
                    readFiles();
                    break;

                case "display":
                    displayFiles();
                    break;

                case "exit":
                    System.out.println("Bye bye!");
                    break;
            }
        } while (!option.equals("exit"));
    }

    private static void displayFiles() {
        System.out.println("Displaying the files...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void readFiles() {
        System.out.println("Reading files...");
    }

    private static String readInput() {
        System.out.print("Please insert your option: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }
}
