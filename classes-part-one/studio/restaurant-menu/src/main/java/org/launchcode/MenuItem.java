package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {

    private Double price;
    private String description;
    private String category;
    private Boolean newItem;
    private Date date;
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MenuItem(Double price, String description, String category, Boolean newItem, Date date) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.date = date;
    }
}
