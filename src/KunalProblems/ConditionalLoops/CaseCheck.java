package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        if(c>=97 && c<=122){
            System.out.println("small letters");
        } else {
            System.out.println("Capital letters");
        }
    }
}
