class Switch {

  public static void main (String[] args) {

    double num1 = 0.0;
    double num2 = 0.0;
    double result = 0.0;
    int selection = 1;
    String operator = "";

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
  }
}
