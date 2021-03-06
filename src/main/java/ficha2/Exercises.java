package ficha2;

import java.text.Normalizer;
import java.util.List;
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
//        System.out.println("Area: " + areaCalc(height, base, choice));
//
//        System.out.println("\n------- Exercise 4 -------");
//        int userInput = requestInt("Input a number: ");
//        System.out.println(userInput + "! = " + calculateFactorial(userInput));
//
//        System.out.println("\n------- Exercise 5 -------");
//        userInput = requestInt("Input a number: ");
//        System.out.println(userInput + "! = " + recursiveFactorial(userInput));
//
//        System.out.println("\n------- Exercise 6 -------");
//        System.out.println("Número total de vogais: " + numTotalVowels("!!Olá Mundo meu!!"));
//
//        System.out.println("\n------- Exercise 7 -------");
//        countEachVowel("Ana Carolina");
//        countEachVowel("Lígia Santos");
//        countEachVowel("Lígia Santos ! ");
//
//        System.out.println("\n------- Exercise 8 -------");
//        List<String> people = new ArrayList<>();
//        people.add("Joana");
//        people.add("Carlos");
//        people.add("ANA");
//        people.add("Roberto");
//        womenPercentage(people);
//        womenPercentage(List.of(new String[]{"Ana", "Cristina", "Carla"}));
//        womenPercentage(List.of(new String[]{"João", "Carlos", "Daniel"}));
//
//
//        System.out.println("\n------- Exercise 9 -------");
//        System.out.println("\n--- 3601 segundos ---");
//        convertSeconds(3601);
//        System.out.println("\n--- 86401 segundos ---");
//        convertSeconds(86401);
//        System.out.println("\n--- 31560000 segundos ---");
//        convertSeconds(60 * 60 * 24 * 30 * 14);
//        System.out.println("\n--- 94680078 segundos ---");
//        convertSeconds(94680078);
//        System.out.println("\n--- 63 segundos ---");
//        convertSeconds(63);
//        System.out.println("\n--- 71 segundos ---");
//        convertSeconds(71);
    }


    // exercício 1
    private static double areaTriangle(double height, double base) {
        return (base * height) / 2;
    }

    // exercício 2
    private static double areaRectangle(double height, double base) {
        return height * base;
    }

    // exercício 3
    private static double areaCalc(double height, double base, double choice) {
        if (choice == 1) {
            return areaTriangle(height, base);
        }
        return areaRectangle(height, base);
    }

    // exercício 4
    private static int calculateFactorial(int userInput) {
        int factorial = userInput;

        if (factorial == 0) {
            return 1;
        }

        for (int i = userInput - 1; i > 0; i--) {
            factorial *= i;
            System.out.println(factorial);
        }
        return factorial;
    }

    // exercício 5
    private static int recursiveFactorial(int userInput) {
        if (userInput == 0) {
            return 1;
        }
        int recursiveFactorial = recursiveFactorial(userInput - 1);
//      System.out.println("recursiveFactorial(userInput - 1) * userInput");
//      System.out.println(recursiveFactorial + " " + userInput);
        int currentFact = recursiveFactorial * userInput;
        System.out.println(currentFact);
        return currentFact;
    }

    // exercício 6
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

    private static boolean isVowelsUsingRegex(String currentLetter) {
        return Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE)
                .matcher(Normalizer.normalize(currentLetter, Normalizer.Form.NFD))
                .find();
    }

    private static boolean isVowel(String currentLetter) {
        switch (Normalizer.normalize(currentLetter.toLowerCase(), Normalizer.Form.NFD)) {
            case "a", "e", "i", "o", "u" -> {
                return true;
            }
        }
        return false;
    }

    // exercício 7
    private static void countEachVowel(String expression) {
        String formattedExpression = Normalizer.normalize(expression, Normalizer.Form.NFD)
                .toLowerCase()
                .replaceAll("[^a-z]", "");
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int consonant = 0;

        for (int j = 0; j < formattedExpression.length(); j++) {
            String currentLetter = String.valueOf(formattedExpression.charAt(j));

            switch (currentLetter) {
                case "a" -> a++;
                case "e" -> e++;
                case "i" -> i++;
                case "o" -> o++;
                case "u" -> u++;
                default -> consonant++;
            }
        }

        System.out.println("a: " + a +
                "\ne: " + e +
                "\ni: " + i +
                "\no: " + o +
                "\nu: " + u);
        int totalVowels = a + e + i + o + u;

        System.out.println("Total of " + consonant + " consonants and " + totalVowels + " vowels in the expression: " + "'" + expression + "'");
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

    // exercício 8
    private static void womenPercentage(List<String> people) {
        int womenCounter = 0;
        for (String person : people) {
            if (person.toLowerCase().endsWith("a")) {
                womenCounter++;
            }
        }
        System.out.println("List: " + people);
        System.out.println("Women: " + (womenCounter * 100) / people.size() + "%.");
    }

    // exercício 9
    private static void convertSeconds(int aSeconds) {
        int years = (aSeconds / (60 * 60 * 24 * 30 * 12));
        int months = (aSeconds / (60 * 60 * 24 * 30)) % 12;
        int days = (aSeconds / (60 * 60 * 24)) % 30;
        int hours = (aSeconds / (60 * 60)) % 24;
        int minutes = (aSeconds / 60) % 60;
        int seconds = aSeconds % 60;

        System.out.println("years: " + years +
                "\nmonths: " + months +
                "\ndays: " + days +
                "\nhours: " + hours +
                "\nminutes: " + minutes +
                "\nseconds: " + seconds);
    }

}



