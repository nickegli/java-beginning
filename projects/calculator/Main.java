import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    double num1 = 0.0;
    double num2 = 0.0;
    double result = 0.0;
    int selection = 1;
    String operator = "";

    // create a scanner to read the command-line input
    Scanner scanner = new Scanner(System.in);

    // prompt for type of operator
    System.out.print("Choose from 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division, 5. Sqroot, 6. Pythagoras: ");
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

        case 6:
        System.out.println("You have selected pythagoras");
        result = num1 / num2;
        operator = "?";
        break;

      default:
        System.out.println("You haven't entered a valid operator! Please restart this application.");
    }

    if (selection == 5){
      //  prompt for num1
      System.out.println("You have selected Sqroot!");
      System.out.print("Enter your number: ");
      num1 = scanner.nextDouble();

      System.out.println(Math.sqrt(num1));

    } else {
      //  prompt for num1
      System.out.print("Enter your first number: ");
      num1 = scanner.nextDouble();

      // prompt for num2
      System.out.print("Enter your second number: ");
      num2 = scanner.nextDouble();

      String outputString = num1 + " " + operator + " " + num2 + " = " + result;
      System.out.println(outputString);
    }
  }
}
