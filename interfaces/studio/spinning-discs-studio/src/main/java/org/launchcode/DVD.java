package org.launchcode;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String discName, String discContents, String discType, double discCapacityMB, double usedDataStorageMB) {
        super(discName, discContents, discType, discCapacityMB, usedDataStorageMB);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeDisc(double usedStorageDataMB) {
        System.out.println(usedStorageDataMB + " MB burned to disc.");
    }

    @Override
    public void readDisc() {
        System.out.println("Disc is running.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
