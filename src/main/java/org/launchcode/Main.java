package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem(12.99, "pizza", "main course", true);
        MenuItem item2 = new MenuItem(12.99, "pizza", "main course", true);
        MenuItem item3 = new MenuItem(7.99, "cake", "dessert", true);

    Menu myMenu = new Menu ();

        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        System.out.println(myMenu.toString());
        System.out.println(item1.toString());

        myMenu.removeMenuItem(item3);

        System.out.println(myMenu.toString());

        System.out.println(item1.toString());
        System.out.println(item1.equals(item2));
        System.out.println(item1.equals(item3));
    }
}
