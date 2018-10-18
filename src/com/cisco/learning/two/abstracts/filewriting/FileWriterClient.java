package com.cisco.learning.two.abstracts.filewriting;

import com.cisco.learning.two.abstracts.TrainingSession;

@TrainingSession(
        topic = "interfaces",
        difficulty = "parca mai merge..."
)
public class FileWriterClient {

    public static void main(String[] args) {
        // ? + : = ternary operator
        final boolean currentTimeIsEven = System.currentTimeMillis() % 2 == 0; // simulating a random operation
        FileWriter fileWriter = currentTimeIsEven ? new DiskFileWriter() : new NetworkFileWriter();
        fileWriter.writeFile("Cisco plays with Diva.mpg");

        // S -> Single Responsibility Principle:    having a single reason to change
        // O -> Open-closed principle:              classes should be open for extension, closed for modification
        // L -> Liskov substitution principle:      ?
        // I -> interface-based segregation:        programming using interfaces: use interfaces in code, instantiate implementations dynamically
        // D -> dependency injection:               collaborators should be injected by a stand-alone component
    }
}
