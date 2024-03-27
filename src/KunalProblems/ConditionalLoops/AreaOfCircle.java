package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        Double radius = scan.nextDouble();
        System.out.println("Area of circle : "+(radius*radius*3.14));
    }
}
