package org.launchcode.java.studio.restaurant;


public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    public boolean isItemNew;

     public MenuItem(Double price, String description, String category) {

         this.price = price;
         this.description = description;
         this.category = category;
         this.isItemNew = isItemNew;
     }

     public String getItem() {
         return itemName;
     }
     public void setDescription(String aDescription) {
         this.description = aDescription;
     }

     public String getCategory() {
         return category;
     }

     public void setCategory(String aCategory) {
         this.category = aCategory;
     }

     public boolean getIsItemNew() {
         return isItemNew;
     }

     public void setIsItemNew() {
         this.isItemNew = isItemNew;
     }

    public boolean isItemNew(MenuItem items) {
         if(items.isItemNew)
             System.out.println("New" + items);
         return isItemNew;
    }
}
