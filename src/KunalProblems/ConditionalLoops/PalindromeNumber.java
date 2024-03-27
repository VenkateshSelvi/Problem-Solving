package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int tempVar = number;
        int reversedNumber = 0;
        while(number>0){
            int temp = (number%10);
            reversedNumber = (reversedNumber*10)+temp;
            number/=10;
        }
        if(tempVar == reversedNumber)
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");

    }
}

