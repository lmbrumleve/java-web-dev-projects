package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {





    private Date lastUpdated;
    private ArrayList <MenuItem> item = new ArrayList<>();

    public Menu(Date lastUpdated, ArrayList<MenuItem> item) {
        this.lastUpdated = lastUpdated;
        this.item = item;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public ArrayList<MenuItem> getItem() {
        return item;
    }

    public void setItem(ArrayList<MenuItem> item) {
        this.item = item;
    }


}
