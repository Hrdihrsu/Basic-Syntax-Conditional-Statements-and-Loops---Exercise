package A02;

import java.util.Scanner;

public class A203Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You are given a group of people, type of the group, on which day of the week they will stay.
        // Based on that information, calculate how much they must pay and print that price on the console.
        // Use the table below. In each cell is the price for a single person. The output should look like
        // that: "Total price: {price}". The price should be formatted to the second decimal point.
        //	Friday	Saturday	Sunday
        //Students	8.45	9.80	10.46
        //Business	10.90	15.60	16
        //Regular	15	20	22.50
        //There are also discounts based on some conditions:
        //•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price
        // by 15%
        //•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
        //•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the
        // total price by 5%
        //You should reduce the prices in that EXACT order.

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        double totalSum = 0;


        switch (typePeople) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.8;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }

                if (countPeople >= 30) {
                    totalSum = price * countPeople * 0.85;
                } else {
                    totalSum = price * countPeople;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 10.9;
                        break;
                    case "Saturday":
                        price = 15.6;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }

                if (countPeople >= 100) {
                    totalSum = price * (countPeople - 10);
                } else {
                    totalSum = price * countPeople;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                if (countPeople >= 10 && countPeople <= 20) {
                    totalSum = price * countPeople * 0.95;
                } else {
                    totalSum = price * countPeople;
                }
                break;
        }

        System.out.printf("Total price: %.2f", totalSum);


    }
}
