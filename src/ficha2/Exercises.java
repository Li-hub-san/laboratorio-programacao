package ficha2;

import java.util.Scanner;

public class Exercises {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
//    double height = requestNumber("Input a height: ");
//    double base = requestNumber("Input a base: ");
//
//    System.out.println("Triangle area: " + areaTriangle(height, base));
//    System.out.println("Rectangle area: " + areaRectangle(height, base));
//
//    double choice = requestNumber("Input 1 to calculate a triangle area or any other number to calculate the rectangle area: ");
//    areaCalc(height, base, choice);

    System.out.print("Input a number: ");
    int userInput = sc.nextInt();
    System.out.println(userInput + "!= " + recursiveFactorial(userInput));

  }

  private static double requestNumber(String message) {
    System.out.print(message);
    return sc.nextDouble();
  }

  private static double areaTriangle(double height, double base) {
    return (base * height) / 2;
  }

  private static double areaRectangle(double height, double base) {
    return height * base;
  }

  private static void areaCalc(double height, double base, double choice) {
    if (choice == 1) {
      System.out.println("Triangle area: " + areaTriangle(height, base));
    } else {
      System.out.println("Rectangle area: " + areaRectangle(height, base));
    }
  }

  private static int calculateFactorial(int userInput) {
    int factorial = userInput;
    for (int i = userInput - 1; i > 0; i--) {
      factorial *= i;
      System.out.println(factorial);
    }
    return factorial;
  }

  private static int recursiveFactorial(int userInput) {
    if (userInput > 0) {
      int recursiveFactorial = recursiveFactorial(userInput - 1);
      System.out.println("recursiveFactorial(userInput - 1) * userInput");
      System.out.println(recursiveFactorial + " " + userInput);
      int currentFact = recursiveFactorial * userInput;
      System.out.println(currentFact);
      return currentFact;
    }
    return 1;
  }

}
