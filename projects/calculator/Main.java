import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    double num1 = 6.5;
    double num2 = 10.5;
    double result = 0.0;
    int selection = 1;
    String operator = "";

    // create a scanner to read the command-line input
    Scanner scanner = new Scanner(System.in);

    //  prompt for num1
    System.out.print("Enter your first number: ");
    num1 = scanner.nextInt();

    // prompt for num2
    System.out.print("Enter your second number: ");
    num2 = scanner.nextInt();

    // prompt for type of operator
    System.out.print("Choose from 1. Addition, 2. Subtraction, 3. Multiplication 4. Dividing: ");
    selection = scanner.nextInt();

    switch(selection) {
      case 1:
        System.out.println("You have selected addition");
        result = num1 + num2;
        operator = "+";
        break;
      case 2:
        System.out.println("You have selected subtraction");
        result = num1 - num2;
        operator = "-";
        break;
      case 3:
        System.out.println("You have selected multiplication");
        result = num1 * num2;
        operator = "*";
        break;
      case 4:
        System.out.println("You have selected division");
        result = num1 / num2;
        operator = "/";
        break;
      default:
        System.out.println("You haven't entered a valid operator! Please restart this application.");
    }
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result );
  }
}
