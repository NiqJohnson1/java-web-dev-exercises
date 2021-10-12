package exercises.technology;

public class Laptop extends Computer{
    private String brandName;
    private String model;
    private int screenSize;
    private boolean powerOn = false;

    public Laptop(String brandName, String model, int screenSize){
        super();
        this.brandName = brandName;
        this.model = model;
        this.screenSize = screenSize;
    }

    public boolean powerOn() {
       return this.powerOn = true;
    }

public String toString(){
    return brandName + " " + model + " " + screenSize;
}
}
