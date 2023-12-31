package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        //Compare by number of allergens
        int allergenComparison = Integer.compare(flavor1.getAllergens().size(), flavor2.getAllergens().size());
        if (allergenComparison != 0) {
            return allergenComparison;
        }

        //Compare by name
        int nameComparison = flavor1.getName().compareTo(flavor2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }

        return 0;
    }
}
