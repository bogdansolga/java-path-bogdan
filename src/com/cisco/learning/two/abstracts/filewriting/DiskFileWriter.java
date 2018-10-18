package com.cisco.learning.two.abstracts.filewriting;

public class DiskFileWriter implements FileWriter {

    @Override
    public void writeFile(String fileName) {
        System.out.println("Writing '" + fileName + "' on the disk...");
    }
}
