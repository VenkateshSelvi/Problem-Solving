package KunalProblems.firstJava;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check odd or even: ");
        int num = scan.nextInt();
        if(num%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
