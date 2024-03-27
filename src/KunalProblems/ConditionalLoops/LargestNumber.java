package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();
        int numberThree = scan.nextInt();
        int greaterNumber = numberOne;
        if(numberTwo>greaterNumber){
            greaterNumber = numberTwo;
        }
        if(numberThree>greaterNumber){
            greaterNumber = numberThree;
        }
        System.out.println("Greater number is "+greaterNumber);

        System.out.println(Math.max(numberThree, Math.max(numberOne,numberTwo)));
    }
}
