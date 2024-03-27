package KunalProblems.ConditionalLoops;

import java.util.Scanner;
//Find the nth number in Fibonacci Series 0,1,1,2,3,5,8,13,21
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to print the nth Fibonacci number: ");
        int number = input.nextInt(), count = 2, a = 0, b = 1, sum = 0;
        while(count!=number){
            sum = a + b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(sum);
    }
}
