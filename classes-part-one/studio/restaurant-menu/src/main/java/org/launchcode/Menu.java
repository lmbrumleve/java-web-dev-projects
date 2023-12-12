package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList <MenuItem> menuItems = new ArrayList<>();

    public Menu(Date lastUpdated, ArrayList<MenuItem> menuItems) {
        this.lastUpdated = lastUpdated;
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public ArrayList<MenuItem> getItem() {
        return menuItems;
    }

    public void setItem(ArrayList<MenuItem> item) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem newItem) {
        this.menuItems.add(newItem);
    }

    public void removeMenuItem(MenuItem removeThisItem) {
        for(int i=0; i<this.menuItems.size(); i++) {
            if (this.menuItems.get(i).equals(removeThisItem)) {
                this.menuItems.remove(i);
            }
        }
    }

public void printMenu() {
    System.out.println(this.lastUpdated);
    for(MenuItem item : menuItems) {
        System.out.println(item.getPrice());
        System.out.println(item.getDescription());
        System.out.println(item.getDate());
        System.out.println(item.isNewItem());
    }
}

}
