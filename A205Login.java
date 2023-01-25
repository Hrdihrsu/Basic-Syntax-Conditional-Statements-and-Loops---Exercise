package A02;

import java.util.Scanner;

public class A205Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given a string representing a username. The password will be that username reversed.
        // Until you receive the correct password, print on the console "Incorrect password. Try again.".
        // When you receive the correct password, print "User {username} logged in." However, on the fourth try,
        // if the password is still not correct, print "User {username} blocked!" and end the program.
        String username = scanner.nextLine();
        String password = "";
        int lightUsername = username.length();

        for (int i = lightUsername - 1; i >= 0; i--) {
            char a = username.charAt(i);
            password += a;
        }

        String pass = scanner.nextLine();
        int countFiledPass = 0;

        while (!password.equals(pass)) {
            countFiledPass++;
            if (countFiledPass >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();

        }
        if (password.equals(pass)) {
            System.out.printf("User %s logged in.", username);

        }

    }
}
