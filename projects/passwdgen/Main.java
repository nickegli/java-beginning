import java.util.Scanner;
import java.awt.event.*;  
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Test");

    // define all variables //
    float PwdLength = 0;

    // create a scanner to read the command-line input
    Scanner scanner = new Scanner(System.in);

    // prompt for length of password //
    System.out.print("What length should you password have?");
    selection = scanner.nextPwdLength();

    System.out.println(PwdLength);
  }
}
