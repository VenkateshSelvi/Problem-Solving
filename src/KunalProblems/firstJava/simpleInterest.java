package KunalProblems.firstJava;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter principle: ");
        int principle = scan.nextInt();
        System.out.print("Enter rate: ");
        int rate = scan.nextInt();
        System.out.print("Enter time: ");
        int time = scan.nextInt();
        float value = principle*(1+(rate*time));
        System.out.println("Simple Interest value: "+value);
    }
}
