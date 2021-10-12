package exercises.technology;

public class SmartPhone extends Computer {
    private double cameraPx;
    private String brand;
    private boolean isRinging = false;

    public SmartPhone(String brand, double cameraPx){
        this.cameraPx = cameraPx;
        this.brand = brand;
    }

    public boolean phoneRing() {
        return this.isRinging = true;
    }
    public String toString(){
        return brand + " " + cameraPx;
    }
}
