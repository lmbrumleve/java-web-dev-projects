package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class BaseDisc {

    private String discName;

    private String discContents;

    private String discType;
    private double discCapacityMB;

    private double usedDataStorageMB;

    public BaseDisc(String discName, String discContents, String discType, double discCapacityMB, double usedDataStorageMB) {
        this.discName = discName;
        this.discContents = discContents;
        this.discType = discType;
        this.discCapacityMB = discCapacityMB;
        this.usedDataStorageMB = usedDataStorageMB;
    }

    public double deleteDisc() {
        usedDataStorageMB = 0;
        System.out.println("All data has been deleted. Remaining disc space: " + (discCapacityMB - usedDataStorageMB) + " MB.");
        return usedDataStorageMB;
    };

    public void checkStorageCapacity() {
        System.out.println((discCapacityMB - usedDataStorageMB) + " MB remaining on disc.");
    };
}
