package com.cisco.learning.two.abstracts.filewriting;

@Deprecated // you can use it, but it's no longer advised / maintained / ...
public class NetworkFileWriter implements FileWriter {

    @Override
    public void writeFile(String fileName) {
        System.out.println("Writing the file '" + fileName + "' on the network...");
    }
}
