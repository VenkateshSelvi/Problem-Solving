package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = input.nextLong();
        int reversedNumber = 0;
        while(number>0){
            int temp = (int) (number%10);
            reversedNumber = (reversedNumber*10)+temp;
            number/=10;
        }
        System.out.print("Reversed the number: "+reversedNumber);
    }
}
