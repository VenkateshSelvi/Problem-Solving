package KunalProblems.firstJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter operator: ");
        String operator = scan.next();
        if(operator.equals("+"))
            System.out.println(num1+num2);
        else if(operator.equals("-"))
            System.out.println(num1-num2);
        else if(operator.equals("*"))
            System.out.println(num1*num2);
        else if(operator.equals("/"))
            System.out.println(num1/num2);
        else
            System.out.println("Enter a valid operators(+-*/)");
    }
}
