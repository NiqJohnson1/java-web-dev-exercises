package org.launchcode.java.studio.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
        private ArrayList<MenuItem> items;
        private Date updatedMenuDate;


        public Menu (Date updatedMenuDate, ArrayList<MenuItem> item){
                this.updatedMenuDate = updatedMenuDate;
                this.items = item;
        }

        public ArrayList<MenuItem> getItems() {
                return items;
        }

        public void setItems(ArrayList<MenuItem> items) {
                this.items = items;
        }

        public Date getUpdatedMenuDate() {
                return updatedMenuDate;
        }

        public void setUpdatedMenuDate(Date updatedMenuDate) {
                this.updatedMenuDate = updatedMenuDate;
        }

        // A way to ADD menu items from the menu.
        public ArrayList <MenuItem> addItems(MenuItem item) {
                this.items.add(item);
              return this.items;

        }

        // A way to REMOVE menu items from the menu.
        public ArrayList <MenuItem> removeItems(MenuItem item) {
                this.items.remove(item);
                return this.items;

        }

        // A way to tell when the menu was last updated.
        public String lastUpdated() {
                return ("Last update to this menu was" + updatedMenuDate);
        }

        // A way to print out the entire menu.
        public void entireMenu() {
                for (int i = 0; i < items.size(); i++) {
                        System.out.println(items.get(i));
                }
        }
        // A way to print out a single menu item
         public void singleMenu(MenuItem item) {
                        System.out.println(item);
                }

        }



