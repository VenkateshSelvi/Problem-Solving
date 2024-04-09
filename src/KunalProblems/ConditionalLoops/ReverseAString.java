package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String to reverse: ");
        String value = scan.next();
        String result = "";
        for(int i = value.length()-1; i>=0; i--){
            result = result + value.charAt(i);
        }
        System.out.println(result);
    }
}
