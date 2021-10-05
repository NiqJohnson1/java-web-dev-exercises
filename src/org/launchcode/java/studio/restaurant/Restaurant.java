package org.launchcode.java.studio.restaurant;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    enum MenuCategory{
        APPETIZER, MAIN_COURSE, DESSERT;
    }
    public static void main(String[] args) {
        MenuCategory category = MenuCategory.DESSERT;
        Date updatedMenuDate = new Date();
        ArrayList item = new ArrayList();
      Menu restaurantMenu = new Menu (updatedMenuDate, item);
      item.add(0,"Beef Dinner");
        item.add(1,"Chicken Marsala");
        item.add(2,"Baked Lemon Pepper Fish");

        item.add(3,"Tiramisu");
        item.add(4,"Peach Cobbler");
        item.add(5,"Chocolate Molten Lava Cake");



        System.out.println(MenuCategory.MAIN_COURSE);
        System.out.println(item.get(0));
        System.out.println(item.get(1));
        System.out.println(item.get(2) + "\n");

        System.out.println(MenuCategory.DESSERT);
        System.out.println(item.get(3));
        System.out.println(item.get(4));
        System.out.println(item.get(5));

        System.out.println("Menu Last Updated: " + updatedMenuDate);

    }
}
