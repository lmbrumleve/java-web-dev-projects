package org.launchcode;

public class Main {
    public static void main(String[] args) {



    CD myCD = new CD("Music", "Good Music", "CD", 700, 0);
    DVD myDVD = new DVD("Movie", "Movie", "DVD",5000, 0);
    myCD.spinDisc();
    myCD.writeDisc(500);
    myCD.readDisc();
    myCD.deleteDisc();
    myCD.checkStorageCapacity();

    myDVD.spinDisc();
    myDVD.writeDisc(500);
    myDVD.readDisc();
    myDVD.checkStorageCapacity();
    myDVD.deleteDisc();


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}