package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int number = scan.nextInt();
        int factorial = 1;
        for(int i = 1; i<=number; i++){
           factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
