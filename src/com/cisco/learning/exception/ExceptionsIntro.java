package com.cisco.learning.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsIntro {

    public static void main(String[] args) {
        /*
        simpleExceptionHandling();

        try {
            handlingCheckedExceptions();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //handlingUncheckedExceptions();

        int number = 20;
        //validatingANumber(number);

        usingTryWithResources();
    }

    private static void usingTryWithResources() {
        try (FileReader fileReader = new FileReader("something");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            final int read = fileReader.read();
            System.out.println("First byte is " + read);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        throw new NotEnoughTimeException();
    }

    private static void validatingANumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must be greater than 0");
        }

        System.out.println("Processing the number " + number + "...");
    }

    private static void handlingUncheckedExceptions() { // ca si Liviu Dracnea, (c) Bogdan
        String number = "45x";
        //int parsed = Integer.parseInt(number); // NFE is an unchecked exception

        try {
            // happy path
            System.out.println("The number is " + Integer.parseInt(number));
        } catch (NumberFormatException ex) {
            // unhappy path / exceptional path
            System.err.println("'" + number + "' is not a valid number");
            ex.printStackTrace();
        } finally {
            System.out.println("It will always be called");
        }

        //throw new IllegalArgumentException("An example of an exception throwing");
    }

    private static void handlingCheckedExceptions() throws IOException {
        File file = new File("something"); // 1st way of handling checked exceptions - using try/catch
        try {                                       // the most common and recommended (for now)
            final boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File anotherFile = new File("something else"); // 2nd way of using checked exceptions
        anotherFile.createNewFile();
    }

    private static void simpleExceptionHandling() {
        String cat = null;

        try {
            System.out.println(cat.length());
        } catch (NullPointerException ex) { // more specific
            System.err.println("An exception occurred while displaying the length - " + ex.getMessage());
        } catch (Exception ex) {            // less specific
            System.err.println("Even worse than NPE");
        } catch (Throwable t) {
            System.err.println("This will catch _everything_");
        }
    }
}
