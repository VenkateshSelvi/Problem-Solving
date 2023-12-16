package KunalProblems.firstJava;

import java.util.Scanner;

public class CurrencyToUSD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter currency: ");
        double currency = scan.nextDouble();
        System.out.println(currency/83.43);
    }
}
