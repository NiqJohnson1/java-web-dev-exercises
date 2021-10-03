package org.launchcode.java.studio.restaurant;
import java.util.Date;

public class MenuItem {
    private String itemName;
    private double price;
    private String description;
    private String category;
    public boolean isItemNew;
    private Date updatedDate;

     public MenuItem(Double price, String description, String category) {

         this.price = price;
         this.description = description;
         this.category = category;
         this.isItemNew = isItemNew;
         this.updatedDate = updatedDate;
     }

     public String getItem() {
         return itemName;
     }
     public void setDescription(String aDescription) {
         this.description = description;
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

     public Date getUpdatedDate() {
         return updatedDate;
     }

     public void setUpdatedDate(Date aUpdatedDate) {
         this.updatedDate = updatedDate;
     }


}
