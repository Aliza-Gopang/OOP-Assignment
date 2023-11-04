import java.util.Scanner;

public class calc {
    public static void main(String[] mop) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                // Display a welcome message
                System.out.println("Basic Calculator\n");

                // Prompt the user to enter an expression
                System.out.println("Enter an expression (e.g: '5 + 10'):");
                String userInput = input.nextLine();

                if (isValidExpression(userInput)) {
                    // Split the input into parts
                    String[] parts = userInput.split(" ");
                    double num1 = Double.parseDouble(parts[0]);
                    String operation = parts[1];
                    double num2 = Double.parseDouble(parts[2]);

                    // Calculate the result
                    double result = performCalculation(num1, operation, num2);

                    // Display the result
                    System.out.println("Result: " + result);
                } else {
                    // If the input is not a valid expression, throw an exception
                    throw new IllegalArgumentException("\nInvalid expression. Enter Again");
                }

                // Ask if the user wants to continue the calculation
                System.out.println("\nDo you want to continue the calculation? (Enter 'Y' to continue or any key to exit)");
                String continueResponse = input.nextLine().toLowerCase();

                if (!continueResponse.equals("y")) {
                    // If the user's response is not 'Y', exit the loop and display a thank you message
                    System.out.println("Thank you for using the Calculator");
                    break;
                }
            } catch (IllegalArgumentException | ArithmeticException e) {
                // Catch and handle exceptions related to input or calculations
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // Check if the input is a valid expression
    private static boolean isValidExpression(String expression) {
        String[] parts = expression.split(" ");
        return parts.length == 3 && "+-*/".contains(parts[1]) && isDouble(parts[0]) && isDouble(parts[2]);
    }

    // Perform the calculation based on the operator
    private static double performCalculation(double num1, String operation, double num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    // Handle division by zero
                    throw new ArithmeticException("\nDivision by 0 is not allowed.");
                }
                return num1 / num2;
            default:
                // Handle invalid operators
                throw new IllegalArgumentException("\nEntered operator is invalid. Valid operators are: '+', '-', '/', '*'");
        }
    }

    // Check if a string can be parsed as a double
    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}