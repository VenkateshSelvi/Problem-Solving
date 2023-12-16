package KunalProblems.firstJava;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        String word = scan.next();
        String empty = "";
        for(int i = word.length()-1; i>=word.length()/2; i--){
            empty = empty + word.charAt(i);
        }
        if(word.length()%2==0 && empty.equals(word.substring(0,word.length()/2))){
            System.out.println("Palindrome");
        } else if(word.length()%2!=0 && empty.equals(word.substring(0,(word.length()/2)+1))) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
