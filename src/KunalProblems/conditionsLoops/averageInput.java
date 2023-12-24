package KunalProblems.conditionsLoops;

import java.util.Scanner;

public class averageInput {
    public static void main(String[] args) {
        double n = 0, num = 0;
        do{
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            num += number;
            n++;
        }
        while(n!=10);
        System.out.println(num/10);
    }
}
