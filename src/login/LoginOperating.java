package login;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginOperating {
    public static void loginOperating() {
        do{
        LoginManagement userManager = new LoginManagement();
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Quit");
        System.out.print("Select an option: ");
            int option = 0;
            try {
                option = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" You have to type one of the number from 1 to 3, please re-type : ");
            }
            if (option <= 0 || option > 3) {
                System.out.print("You have to type one of the number from 1 to 3, please re-type : ");
            }
            if (option == 1) {
                System.out.print("Username: ");
                String username = new Scanner(System.in).nextLine();
                System.out.print("Password: ");
                String password = new Scanner(System.in).nextLine();
                userManager.register(username, password);
                System.out.println("Registered successfully.");

            } else if (option == 2) {
                do {
                    System.out.print("Username: ");
                    String username = new Scanner(System.in).nextLine();
                    System.out.print("Password: ");
                    String password = new Scanner(System.in).nextLine();
                    userManager.login(username, password);
                    if (userManager.login(username, password)) {
                        System.out.println("Logged in successfully.");
                        break;
                    } else {
                        System.out.println("Invalid username or password. Please re-login");
                    }
                } while (true);

            } else if (option == 3) {
                break;
            }


            System.out.println();


        } while (true);
    }
}
