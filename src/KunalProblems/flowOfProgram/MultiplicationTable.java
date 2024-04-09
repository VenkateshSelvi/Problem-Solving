package KunalProblems.flowOfProgram;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication table");
        int table = input.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.printf("%d * %d = %d ", table, i, table*i).println();
        }
    }
}

