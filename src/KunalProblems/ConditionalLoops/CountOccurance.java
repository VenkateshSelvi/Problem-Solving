package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = input.nextLong(), count = 0;
        System.out.print("Enter the number to find the occurance: ");
        int occurance = input.nextInt();
        while(number!=0){
            int temp =(int) number%10;
            if(occurance == temp)
                count++;
            number/=10;
        }
        System.out.println("Occurance of the number is : "+count);
    }
}
