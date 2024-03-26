package KunalProblems.flowOfProgram;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int numberOne = input.nextInt();
        System.out.println("Enter second number");
        int numberTwo = input.nextInt();
        System.out.printf("%d + %d = %d ",numberOne, numberTwo, numberOne+numberTwo).println();
    }
}
