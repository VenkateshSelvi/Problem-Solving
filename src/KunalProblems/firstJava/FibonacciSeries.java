package KunalProblems.firstJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        int a = 0, b = 1, sum = 0, count = 2;
        while(num!=count) {
            sum = a+b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(sum);
    }
}
