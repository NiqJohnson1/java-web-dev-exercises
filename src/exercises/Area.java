package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("What is the length of the rectangle: ");
       Double length = input.nextDouble();
       System.out.println("The length is " + length);
       System.out.println("What is the rectangle's width: ");
       Double width = input.nextDouble();
       double area = length * width;
       System.out.println("The area is " + area);


    }
}
