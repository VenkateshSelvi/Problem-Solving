package KunalProblems.ConditionalLoops;

import java.util.Scanner;

public class LargestNumberOfAll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int greater = 0;
        while(true){
            int num = scan.nextInt();
            if(num == 0)
                break;
            if(num>greater)
                greater = num;
        }
        System.out.println(greater);
    }
}
