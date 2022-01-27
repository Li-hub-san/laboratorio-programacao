package ficha2;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("\n------- Exercise 1 -------");
//        double height = requestDouble("Input a height: ");
//        double base = requestDouble("Input a base: ");
//        System.out.println("Triangle area: " + areaTriangle(height, base));
//
//        System.out.println("\n------- Exercise 2 -------");
//        System.out.println("Rectangle area: " + areaRectangle(height, base));
//
//        System.out.println("\n------- Exercise 3 -------");
//        double choice = requestDouble("Input 1 to calculate a triangle area or any other number to calculate the rectangle area: ");
//        areaCalc(height, base, choice);
//
//        System.out.println("\n------- Exercise 4 -------");
//        int userInput = requestInt("Input a number: ");
//        System.out.println(userInput + "! = " + calculateFactorial(userInput));
//
//        System.out.println("\n------- Exercise 5 -------");
//        int userNumber = requestInt("Input a number: ");
//        System.out.println(userNumber + "! = " + recursiveFactorial(userNumber));
//
//        System.out.println("\n------- Exercise 6 -------");
//        String userExpression = requestString("Input any expression: ");
//        System.out.println("Vowels in your expression: " + numTotalVowels(userExpression));

        System.out.println("\n------- Exercise 7 -------");
        String userExpression = requestString("Input any expression: ");
//        System.out.println(countVowel(userExpression));
    }

    private static double requestDouble(String message) {
        System.out.print(message);
        double number = sc.nextDouble();
        sc.nextLine();
        return number;
    }

    private static int requestInt(String message) {
        System.out.print(message);
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    private static String requestString(String message) {
        System.out.print(message);
        return sc.nextLine();
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
//      System.out.println("recursiveFactorial(userInput - 1) * userInput");
//      System.out.println(recursiveFactorial + " " + userInput);
            int currentFact = recursiveFactorial * userInput;
//      System.out.println(currentFact);
            return currentFact;
        }
        return 1;
    }

    private static int numTotalVowels(String userExpression) {
        int vowelCount = 0;

        for (int i = 0; i < userExpression.length(); i++) {
            String currentLetter = String.valueOf(userExpression.charAt(i)).toLowerCase();

            if (isVowelsUsingRegex(currentLetter)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    private static boolean isVowel(String currentLetter) {
        switch (Normalizer.normalize(currentLetter.toLowerCase(), Normalizer.Form.NFD)) {
            case "a", "e", "i", "o", "u" -> {
                return true;
            }
        }
        return false;
    }

    private static boolean isVowelsUsingRegex(String currentLetter) {
        return Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE)
                .matcher(Normalizer.normalize(currentLetter, Normalizer.Form.NFD))
                .find();
    }

    // Ex.7:Crie uma função chamada numVogais que recebe uma String (frase) e imprime a quantidade de cada vogal na mesma.
    private static void countVowel(String expression) {
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        int consonant = 0;

        for (int i = 0; i < expression.length(); i++) {
            char currentLetter = expression.charAt(i);

        switch (currentLetter) {
            case 'a' -> {
                aCount++;
                System.out.println("a =" + aCount);
            }
            case 'e' -> {
                eCount++;
                System.out.println("e =" + eCount);
            }
            case 'i' -> {
                iCount++;
                System.out.println("i =" + iCount);
            }
            case 'o' -> {
                oCount++;
                System.out.println("e =" + oCount);
            }
            case 'u' -> {
                uCount++;
                System.out.println("e =" + uCount);
            }
            default -> System.out.println("This expression does not contain vowel, only " + consonant + " consonants.");
        }
        }
    }

}



