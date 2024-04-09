package KunalProblems.firstJava;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        //Approch 1
        /*Scanner scan = new Scanner(System.in);
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
        }*/

        //Approach 2
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        String word = scan.next();
        boolean isPalindrome = true;

        for(int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
