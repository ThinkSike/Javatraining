import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.print("Enter your monthly income: ");
            double income = sc.nextDouble();

            if (age >= 18 && income >= 25000) {
                System.out.println("Loan Approved!");
            } else {
                System.out.println("Loan Rejected!");
            }

            System.out.print("Do you want to check another application? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you!");
        sc.close();
    }
}
