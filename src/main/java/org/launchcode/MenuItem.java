package org.launchcode;

public class MenuItem<isInstanceOf> {

    public double getPrice() {
        return price;
    }

    private double price;

    public String getDescription() {
        return description;
    }

    private String description;

    public String getCategory() {
        return category;
    }

    private String category;

    public boolean isNew() {
        return isNew;
    }

    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {

        String returnString = "";

        returnString += "Item description: " + this.description + "\n";
        returnString += "Item price: " + this.price + "\n";
        returnString += "Item category: " + this.category + "\n";
        returnString += "Item is new: " + this.isNew + "\n";

        return returnString;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MenuItem menuItem)) {
            return false;
        }

        // Check for null values before comparing fields
        if (this.description == null || this.category == null) {
            return false;
        }

        return this.description.equals(menuItem.description) &&
                this.category.equals(menuItem.category);
    }

}

