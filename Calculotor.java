import java.util.Scanner;

public class Calculotor{

   
    public static void printWelcome() {
        System.out.println("========================================");
        System.out.println("      WELCOME TO CALCULATOR             ");
        System.out.println("========================================");
    }

  
    public static void printMenu() {
        System.out.println("\nSelect your operation:");
        System.out.println("  [1] Add");
        System.out.println("  [2] Subtract");
        System.out.println("  [3] Multiply");
        System.out.println("  [4] Divide");
        System.out.println("  [5] Exit");
        System.out.print("Your choice: ");
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        printWelcome();

        while (running) {
            printMenu();
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calcu-Bot 3000... Have a great day!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            String operationName = "";

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operationName = "Addition";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operationName = "Subtraction";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operationName = "Multiplication";
                    break;
                case 4:
                    result = divide(num1, num2);
                    operationName = "Division";
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
                    continue;
            }

            if (!Double.isNaN(result)) {
                System.out.println("----------------------------------------");
                System.out.println("Result of " + operationName + ": " + result);
                System.out.println("----------------------------------------");
            }
        }

        scanner.close();
    }
}