package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();

        System.out.println("How much gas has been used:");
        Double gas = input.nextDouble();

        Double milesPerGallon = miles / gas;
        System.out.println("Total MPG = " + milesPerGallon + "(mpg)");

    }
}
