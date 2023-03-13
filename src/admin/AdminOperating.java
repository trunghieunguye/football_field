package admin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminOperating extends Admin {


    public AdminOperating(String name, int phoneNumber, int fieldPrice, int bonusPoint, int fieldNumber, int playTime) {
        super(name, phoneNumber, fieldPrice, bonusPoint, fieldNumber, playTime);
    }

    public static void adminOperating() {

        do {
            System.out.println("=====Choose the function that you want======== ");
            System.out.println("1. Set the name ");
            System.out.println("2. Set phone number ");
            System.out.println("3. Set field price ");
            System.out.println("4. Set bonus point ");
            System.out.println("5. Set field number ");
            System.out.println("6. Set play time ");
            System.out.print("Select an option: ");

            int choice = 0;
            try {

                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" You have to type one of the number from 1 to 6, please re-type : ");
            }
            if (choice <= 0 || choice > 6) {
                System.out.print("You have to type one of the number from 1 to 6, please re-type : ");
            }
            if (choice == 1) {
                System.out.print("Type the name : ");
                do {
                    try {
                        String name = new Scanner(System.in).nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.print(" Invalid data, please re-type : ");
                    }
                    System.out.println("Successfully . "  + " is updated");
                } while (true);


            } else if (choice == 2) {
                System.out.print("Type the phone number : ");
                do {
                    try {
                        int phoneNumber = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print(" Invalid data, please re-type : ");
                    }
                    System.out.println("Successfully. The phone number is updated ");

                } while (true);


            } else if (choice == 3) {
                System.out.print("Type the field price : ");
                do {
                    try {
                        int fieldPrice = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print(" Invalid data, please re-type : ");
                    }
                    System.out.println("Successfully. The filed price is updated");

                } while (true);

            } else if (choice == 4) {
                System.out.print("Type the bonus point : ");
                do {
                    try {
                        int bonusPoint = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print(" Invalid data, please re-type : ");
                    }
                    System.out.println("Successfully. The bonus point is updated");

                } while (true);


            } else if (choice == 5) {
                System.out.print("Type the field number : ");
                do {
                    try {
                        int fieldNumber = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print(" Invalid data, please re-type : ");
                    }
                    System.out.println("Successfully. The field number is updated");

                } while (true);

            } else if (choice == 6) {
                System.out.print(" Type the playtime : ");
                do {
                    try {
                        int playTime = new Scanner(System.in).nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print(" Invalid data, please re-type : ");
                    }
                    System.out.println("Successfully. the play time is updated");

                } while (true);


            }
        } while (true);
    }
}
