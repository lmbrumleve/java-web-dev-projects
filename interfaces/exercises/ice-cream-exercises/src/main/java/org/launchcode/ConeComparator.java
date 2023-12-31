package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() < cone2.getCost()) return -1;
        if (cone1.getCost() > cone2.getCost()) return 1;
        return 0;
    }
}
