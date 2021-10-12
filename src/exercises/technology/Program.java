package exercises.technology;

public class Program extends Computer{
    public static void main(String[] args) {
        Laptop hp = new Laptop("HP", "6270 Intel Core", 15);
        Laptop toshiba = new Laptop("Toshiba", "8400", 14);
        SmartPhone samsung = new SmartPhone("Samsung S10", 4.23);



        System.out.println(hp);
        System.out.println(toshiba);
        System.out.println(samsung);








    }
}
