import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double total = 0;

        do {
            System.out.println("\n----- RESTAURANT MENU -----");
            System.out.println("1. Burger - ₹120");
            System.out.println("2. Pizza - ₹250");
            System.out.println("3. Sandwich - ₹100");
            System.out.println("4. Coffee - ₹80");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    total += 120;
                    System.out.println("Burger added.");
                    break;

                case 2:
                    total += 250;
                    System.out.println("Pizza added.");
                    break;

                case 3:
                    total += 100;
                    System.out.println("Sandwich added.");
                    break;

                case 4:
                    total += 80;
                    System.out.println("Coffee added.");
                    break;

                case 5:
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        System.out.println("Total Bill = ₹" + total);
        sc.close();
    }
}
