import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RestaurantOrderingSystem {

    public static void main(String[] args) {
        mainmenu();
    }

    public static void mainmenu() {
        clearScreen();

        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│      Welcome To Nifad's Cafe        │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│             MAIN MENU               │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│ 1. Customer Section                 │");
        System.out.println("│ 2. Give Feedback                    │");
        System.out.println("│ 3. View Feedbacks                   │");
        System.out.println("│ 4. Staff Attendance                 │");
        System.out.println("│ 5. Close Application                │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│                                     │");
        System.out.println("└─────────────────────────────────────┘");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Options: ");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                customer();
                break;
            case 2:
                giveFeedback();
                break;
            case 3:
                viewFeedbacks();
                break;
            case 4:
                staffAttendance();
                break;
            case 5:
                System.out.println("\n\n\n");
                System.out.println("\t\t Thank you  ");
                System.out.println("\t\t Feeling Hungry Time to Snack\n");
                System.out.println("\t---------------------------------------------\n");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input! Kindly input the correct Option.....");
                mainmenu();
                break;
        }
    }

    public static void customer() {
        clearScreen();
        System.out.println("----------------------------------------------");
        System.out.println("              Select Categories              ");
        System.out.println("----------------------------------------------");
        System.out.println(" 1. Order Snack");
        System.out.println(" 2. View Order");
        System.out.println(" 3. Back to main menu");
        System.out.println("----------------------------------------------");
        System.out.print("Enter Your Options: ");

        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();

        switch (c) {
            case 1:
                clearScreen();
                osnack();
                break;
            case 2:
                clearScreen();
                viewOrder();
                break;
            case 3:
                clearScreen();
                mainmenu();
                break;
            default:
                System.out.println("Wrong input! Kindly input the correct Option.....");
                customer();
                break;
        }
    }

    public static void osnack() {
        clearScreen();
        int choice;
        int again;
        int quantity;
        double total = 0;

        System.out.println("\t---------------------------------------------");
        System.out.println("\t\t\t SNACK MENU");
        System.out.println("\t---------------------------------------------");
        System.out.println("\t INPUT NUMBER FOR SELECTED MENU \n\n\t1.French Fries 150 Taka\n\n\t2.Cheeseburger 250 Taka \n\n\t3.Sandwich 220 Taka \n\n\t4.Hot dog 180 Taka \n\n\t5.Noodles 60 Taka \n\n\t6.Cold Coffe 120 Taka\n \n\t7.Back to main mune\n\t \n\tEnter Your Choice---> ");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Quantity: ");
                quantity = scanner.nextInt();
                total = total + 150 * quantity;
                System.out.println("\n");
                System.out.println("\t Press 1 To Order Again: \n\t Press 2 To Get Your Total:\n\n\n Enter Your Choice:");
                again = scanner.nextInt();
                System.out.println("\n");
                if (again == 1) {
                    System.out.println("\n\n");
                    osnack();
                } else if (again == 2) {
                    System.out.printf("Your Total Amount is: %.2f\n\n", total);
                    int totl = (int) total;
                    try {
                        FileWriter writer = new FileWriter("order.txt", true);
                        writer.write("\nGrand Total: " + totl + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    cdetails();
                }
                break;
            case 2:
                System.out.print("Quantity: ");
                quantity = scanner.nextInt();
                total = total + 250 * quantity;
                System.out.println("\n");
                System.out.println("\t Press 1 To Order Again: \n\t Press 2 To Get Your Total:\n\n\n Enter Your Choice:");
                again = scanner.nextInt();
                System.out.println("\n");
                if (again == 1) {
                    System.out.println("\n\n");
                    osnack();
                } else if (again == 2) {
                    System.out.printf("Your Total Amount is: %.2f\n\n", total);
                    int totl = (int) total;
                    try {
                        FileWriter writer = new FileWriter("order.txt", true);
                        writer.write("\nGrand Total: " + totl + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    cdetails();
                }
                break;
            case 3:
                System.out.print("Quantity: ");
                quantity = scanner.nextInt();
                total = total + 220 * quantity;
                System.out.println("\n");
                System.out.println("\t Press 1 To Order Again: \n\t Press 2 To Get Your Total:\n\n\n Enter Your Choice:");
                again = scanner.nextInt();
                System.out.println("\n");
                if (again == 1) {
                    System.out.println("\n\n");
                    osnack();
                } else if (again == 2) {
                    System.out.printf("Your Total Amount is: %.2f\n\n", total);
                    int totl = (int) total;
                    try {
                        FileWriter writer = new FileWriter("order.txt", true);
                        writer.write("\nGrand Total: " + totl + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    cdetails();
                }
                break;
            case 4:
                System.out.print("Quantity: ");
                quantity = scanner.nextInt();
                total = total + 180 * quantity;
                System.out.println("\n");
                System.out.println("\t Press 1 To Order Again: \n\t Press 2 To Get Your Total:\n\n\n Enter Your Choice:");
                again = scanner.nextInt();
                System.out.println("\n");
                if (again == 1) {
                    System.out.println("\n\n");
                    osnack();
                } else if (again == 2) {
                    System.out.printf("Your Total Amount is: %.2f\n\n", total);
                    int totl = (int) total;
                    try {
                        FileWriter writer = new FileWriter("order.txt", true);
                        writer.write("\nGrand Total: " + totl + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    cdetails();
                }
                break;
            case 5:
                System.out.print("Quantity: ");
                quantity = scanner.nextInt();
                total = total + 60 * quantity;
                System.out.println("\n");
                System.out.println("\t Press 1 To Order Again: \n\t Press 2 To Get Your Total:\n\n\n Enter Your Choice:");
                again = scanner.nextInt();
                System.out.println("\n");
                if (again == 1) {
                    System.out.println("\n\n");
                    osnack();
                } else if (again == 2) {
                    System.out.printf("Your Total Amount is: %.2f\n\n", total);
                    int totl = (int) total;
                    try {
                        FileWriter writer = new FileWriter("order.txt", true);
                        writer.write("\nGrand Total: " + totl + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    cdetails();
                }
                break;
            case 6:
                System.out.print("Quantity: ");
                quantity = scanner.nextInt();
                total = total + 120 * quantity;
                System.out.println("\n");
                System.out.println("\t Press 1 To Order Again: \n\t Press 2 To Get Your Total:\n\n\n Enter Your Choice:");
                again = scanner.nextInt();
                System.out.println("\n");
                if (again == 1) {
                    System.out.println("\n\n");
                    osnack();
                } else if (again == 2) {
                    System.out.printf("Your Total Amount is: %.2f\n\n", total);
                    int totl = (int) total;
                    try {
                        FileWriter writer = new FileWriter("order.txt", true);
                        writer.write("\nGrand Total: " + totl + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    cdetails();
                }
                break;
            case 7:
                clearScreen();
                customer();
                break;
            default:
                System.out.println("Wrong input! Kindly input the correct Option.....");
                osnack();
                break;
        }
    }

    public static void cdetails() {
        String fname;
        String lname;
        long phone;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Customer Details");
        System.out.print("First Name: ");
        fname = scanner.nextLine();
        System.out.print("Last Name: ");
        lname = scanner.nextLine();
        System.out.print("Phone: ");
        phone = scanner.nextLong();
        System.out.println("\n\n");
        System.out.println("Your Details Entered Are");
        try {
            FileWriter writer = new FileWriter("order.txt", true);
            writer.write("Order by: " + fname + " " + lname + "\nPhone Number: " + phone + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Phone: " + phone);
        System.out.println("\n\n\n");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\t Your Order will be in 15 minutes..");
        System.out.println("\t\t THANK YOU...");
        System.out.println("Press Any Back to Main Menu");
        scanner.nextLine();
        mainmenu();
    }

    public static void giveFeedback() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************************************************************");
        System.out.println("                           Give Your Feedback                            ");
        System.out.println("*************************************************************************************");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Feedback (max 1000 characters):");
        String feedback = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("feedback.txt", true);
            writer.write(name + " said: " + feedback + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Thank you for your feedback!");

        scanner.nextLine();
        mainmenu();
    }

    public static void viewFeedbacks() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("feedback.txt");
            Scanner fileScanner = new Scanner(file);
            System.out.println(" ┌─────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println(" │                                      List of feedbacks:                                      │");
            System.out.println(" └─────────────────────────────────────────────────────────────────────────────────────┘");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        scanner.nextLine();
        mainmenu();
    }

    public static void staffAttendance() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff Attendance");
        System.out.print("Enter staff ID: ");
        int staffID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter staff name: ");
        String staffName = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("attendance.txt", true);
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            writer.write("Staff ID: " + staffID + "\n");
            writer.write("Staff Name: " + staffName + "\n");
            writer.write("Date: " + currentTime.format(formatter) + "\n\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Attendance recorded successfully!");

        scanner.nextLine();
        mainmenu();
    }

    public static void viewOrder() {
        clearScreen();
        try {
            File file = new File("order.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to go back to CATEGORIES");
        scanner.nextLine();
        customer();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


