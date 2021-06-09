import java.util.Scanner;
import java.awt.event.*;  
import javax.swing.*;

public class Main {

  public static void main (String[] args) {

    // define variables with full scope
    float num1 = 0;
    float num2 = 0;
    float numa = 0;
    float numb = 0;
    float numc = 0;

    int selection = 1;

    double result = 0;

    String operator = "";

    // create a scanner to read the command-line input
    Scanner scanner = new Scanner(System.in);

    // prompt for type of operator //
    System.out.print("Choose from 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division, 5. Sqroot, 6. Pythagoras: ");
    selection = scanner.nextInt();

    if (selection < 7 && selection != 5 && selection != 6){
      System.out.print("Enter the number one: ");
      num1 = scanner.nextFloat();

      System.out.print("Enter the number two: ");
      num2 = scanner.nextFloat();

    } else if (selection == 5) {
      System.out.print("Enter your number: ");
      num1 = scanner.nextFloat();

    } else if (selection == 6) {
      System.out.print("Enter the length of side a: ");
      numa = scanner.nextFloat();

      System.out.print("Enter the length of side b: ");
      numb = scanner.nextFloat();

      System.out.print("Enter the length of side c: ");
      numc = scanner.nextFloat();

    } else {
      System.out.println("Your selection doesn't match any given operation! Please restart this script!");
    }


    // Operator selection //
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

      case 5:
        System.out.println("You have selected sqroot");
        result = Math.sqrt(num1);
        operator = "Squareroot";
        break;

      case 6:
        System.out.println("You have selected pythagoras");
        operator = "Pythagoras";
        if (numa == 0){
          result = Math.sqrt((numc*numc) - (numb*numb));
        } else if (numb == 0){
          result = Math.sqrt((numc*numc) - (numa*numa));
        } else if (numc == 0){
          result = Math.sqrt((numa*numa) + (numb*numb)); 
        }
        break;
    }
    // output result
    if (selection != 5 && selection != 6){
      System.out.println("Your result: " + num1 + " " + operator + " " + num2 + " = " + result);
    } else if (selection == 5){
      System.out.println("The Squareroot of " + num1 + " = " + result);
    } else if (selection == 6){
      System.out.println("The missing side is " + result + " long");
    } else {
      System.out.println("Something has went wrong during the execution.");
    }
  }
}