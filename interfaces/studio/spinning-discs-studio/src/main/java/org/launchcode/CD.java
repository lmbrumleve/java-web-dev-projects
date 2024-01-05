package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String discName, String discContents, String discType, double discCapacityMB, double usedDataStorageMB) {
        super(discName, discContents, discType, discCapacityMB, usedDataStorageMB);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
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
