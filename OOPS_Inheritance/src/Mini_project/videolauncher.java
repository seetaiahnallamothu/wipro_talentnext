package Mini_project;

import java.util.Scanner;

public class videolauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        videostore store = new videostore();
        int choice;

        do {
            System.out.println("\n--- Video Store Menu ---");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter video name to add: ");
                    String addName = scanner.nextLine();
                    store.addvideo(addName);
                    break;
                case 2:
                    System.out.print("Enter video name to check out: ");
                    String checkoutName = scanner.nextLine();
                    store.doCheckout(checkoutName);
                    break;
                case 3:
                    System.out.print("Enter video name to return: ");
                    String returnName = scanner.nextLine();
                    store.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter video name to rate: ");
                    String rateName = scanner.nextLine();
                    System.out.print("Enter rating (1-10): ");
                    int rating = scanner.nextInt();
                    store.receiveRating(rateName, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Thank you for using the Video Rental System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        scanner.close();
    }
}