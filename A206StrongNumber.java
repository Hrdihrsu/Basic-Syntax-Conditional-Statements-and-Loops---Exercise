package A02;

import java.util.Scanner;

public class A206StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6.	Strong Number
        //Write a program to check whether or not a given number is strong. A number is strong if the sum of the
        // Factorial of each digit is equal to the number. For example 145 is a strong number, because
        // 1! + 4! + 5! = 145. Print "yes" if the number is strong and "no" if the number is not strong

        int number = Integer.parseInt(scanner.nextLine());
        int num = number;
        int sumFact = 0;


        while (num > 0) {
            int n = num % 10;
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            sumFact += fact;
            num /= 10;
        }

        if (number == sumFact) {
            System.out.println("yes");
        } else  {
            System.out.println("no");
        }
    }
}
