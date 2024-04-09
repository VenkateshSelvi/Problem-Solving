package KunalProblems.flowOfProgram;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            String number = input.next();
            try {
                sum += Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'x' to finish.");
                break;
            }
        }
        System.out.println(sum);
    }
}
