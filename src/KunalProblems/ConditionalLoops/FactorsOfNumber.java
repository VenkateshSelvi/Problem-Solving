package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to find the factor: ");
        int number = scan.nextInt();
        for(int i = 1; i<=number; i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
