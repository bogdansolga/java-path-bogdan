package com.cisco.learning.landscape;

public class LandscapeMain {

    public static void main(String[] args) {
        Landscape azores = new Landscape();
        azores.setName("Azores Islands");

        Lake lake = new Lake();
        lake.setName("Sete Cidades");
        lake.setBlueLevel(20);
        lake.setColor("Blue");

        azores.addLake(lake);

        azores.displayLandscapeProperties();

        //TODO the landscape _must_ have cats in it

        //TODO create a menu for building the landscape
        //TODO add the option to save and load the landscape elements in/from a file
    }
}
