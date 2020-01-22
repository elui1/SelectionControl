import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        processCustomer();
        System.out.println();
        employeePay();
    }

    public static void processCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.print("Enter the purchase amount: ");
        double purchase = input.nextDouble();
        System.out.print("Enter the tax code: ");
        String code = input.next();
        double tax;
        double total;

        // Assumes user will enter a code between 0-3 inclusive
        if (code.equals("0")) {
            tax = 0.0;
        }
        else if (code.equals("1")) {
            tax = 0.03;
        }
        else if (code.equals("2")) {
            tax = 0.05;
        }
        else {
            tax = 0.07;
        }

        tax = purchase * tax;
        total = purchase + tax;

        System.out.println();
        System.out.println("Your name is " + name);
        System.out.println("The purchase amount is " + purchase);
        System.out.println("The sales tax is " + tax);
        System.out.println("The total amount due is " + total);
    }

    public static void employeePay() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your employee number: ");
        String number = input.next();
        System.out.print("Please enter the pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Please enter the hours worked: ");
        int hours = input.nextInt();
        double payWeekly = 0;

        if (hours <= 0 || hours > 60) {
            System.out.println("Hours must be greater than 0 and less than or equal to 60.");
        }

        if (payRate <= 0 || payRate > 25.00) {
            System.out.println("Pay rate must be greater than 0 and less than or equal to 25.00.");
        }

        if ((hours > 0 && hours <= 60) && (payRate > 0 && payRate <= 25.00)) {
            if (hours <= 35) {
                payWeekly = hours * payRate;
            }
            else {
                payWeekly = 35 * payRate;
                payWeekly = payWeekly + (hours - 35) * (1.5 * payRate);
            }
        }

        if (payWeekly != 0) {
            System.out.println("Your weekly pay is " + payWeekly);
        }
    }
}
