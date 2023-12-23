package KunalProblems.conditionsLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=i*2; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0; i<n; i++){
            for(int k = 0; k<=i;k++){
                System.out.print(" ");
            }
            for(int j = n; j>=0;j--){

            }
        }
    }
}
