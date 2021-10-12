package exercises.technology;

public class Computer {
    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public void Computer (boolean hasKeyboard, int storage, int ram) {
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }
        public int increaseRam(int r) { return this.ram + r;}

        public int increaseStorage(int s){return this.storage + s;}



}















//    private int ram;
//    private int storage;
//    private boolean hasKeyboard;
//
//    public Computer(boolean hasKeyboard, int storage, int ram){
//        this.hasKeyboard = hasKeyboard;
//        this.ram = ram;
//        this.storage = storage;
//    }
//
//    public void increaseRam(int n) {
//        this.ram = this.ram + n;
//    }
//
//    public void increaseStorage(int s){
//        this.storage = this.storage + s;
//    }


