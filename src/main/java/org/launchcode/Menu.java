package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public Menu() {
        this.lastUpdated = new Date();
        this.items = new ArrayList<>();
    }


    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item) {

        this.items.add(item);

        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {

        this.items.remove(item);

        this.lastUpdated = new Date();


    }

    @Override
    public String toString() {
    String returnString = "";

        for (MenuItem item : this.items) {
returnString += item.toString() + "\n\n";
        }
            return returnString;

    }

}


