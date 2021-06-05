// This is my first ever created Java File
public class Main { // Main class is required for every project
  public static void main(String[] args) {
    // Simple addition of two strings including whitespace
    String name = "Yanick";
    String greating = "Welcome";
    System.out.println(greating + " " + name);
    
    // Simple addition of two numbers
    int Num1 = 10;
    int Num2 = 20;
    int result = Num1 + Num2;
    System.out.println(result);

    // Simple if statement
    int x = 20;
    int y = 18;
    if (x > y) {
      System.out.println("x is greater than y");
    }

    // Simple if/else statement
    int num1 = 10;
    int num2 = 15;
    if (num1 > num2){
      // Checks if num1 is bigger then num2
      System.out.println(num1 + " is bigger then " + num2);
    } else {
      // if not reverts to else statement
      System.out.println(num1 + " is smaller then " + num2);
    }

    int time = 20;
    String datetime = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(datetime);
  }
}