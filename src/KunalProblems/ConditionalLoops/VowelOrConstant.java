package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the char to check: ");
        char c = input.next().toLowerCase().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        } else {
            System.out.println("Constant");
        }
    }
}
