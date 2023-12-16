package KunalProblems.firstJava;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        int ansCheck = num;
        int ans = 0, temp = 0;
        while(num!=0){
            temp = (num%10)*(num%10)*(num%10);
            ans = ans + temp;
            num = num / 10;
        }
        if(ansCheck == Integer.valueOf(String.valueOf(ans))){
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Not Amstrong Number");
        }
    }
}
