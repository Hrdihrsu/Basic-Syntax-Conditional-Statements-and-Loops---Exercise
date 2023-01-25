package A02;

import java.util.Scanner;

public class A204PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //4.	Print and Sum
        //Write a program to display numbers from given start to given end and their sum. All the numbers will be integers.
        // On the first line, you will receive the start number, on the second the end number.

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = num1; i <=num2 ; i++) {

            System.out.print(i+" ");
            sum+=i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
