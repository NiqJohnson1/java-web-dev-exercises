package org.launchcode.java.studio.restaurant;



public class Menu {
        private String appetizer;
        private String mainCourse;
        private String dessert;
        private boolean isItemNew;


        public Menu {
                this.appetizer = appetizer;
                this.mainCourse = mainCourse;
                this.dessert = dessert;
                this.isItemNew = isItemNew;
        }

        public String getAppetizer() {
                return appetizer;
        }

        public void setAppetizer(String aAppetizer) {
                appetizer = aAppetizer;
        }

        public String getMainCourse() {
                return mainCourse ;
        }

        public void setMainCourse(String aMainCourse) {
                mainCourse = aMainCourse;
        }

        public String getDessert () {
                return dessert;
        }

        public void setDessert(String aDessert) {
                dessert = aDessert;
        }

        public boolean isItemNew() {
                return isItemNew;
        }

        public void isItemNew(boolean aIsItemNew) {
                isItemNew = aIsItemNew;
        }
}
