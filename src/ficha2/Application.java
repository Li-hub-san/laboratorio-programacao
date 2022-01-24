package ficha2;

import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        areaCalc();
    }

    static void printTriangleArea() {
        System.out.print("Input the value of the triangle height: ");
        double triangleHeight = sc.nextDouble();
        System.out.print("Input the value of the a triangle base: ");
        double triangleBase = sc.nextDouble();

        double triangleArea = Operations.areaTriangle(triangleBase, triangleHeight);
        System.out.println("The area of the triangle is : " + triangleArea);
    }

    static void printRectangleArea() {
        System.out.print("Input the value of the rectangle height: ");
        double rectangleHeight = sc.nextDouble();
        System.out.print("Input the value of the rectangle length: ");
        double rectangleLength = sc.nextDouble();

        double rectangleArea = Operations.areaRectangle(rectangleHeight, rectangleLength);
        System.out.println("Rectangle area: " + rectangleArea);
    }

    static void areaCalc() {
        System.out.print("Input a number: ");
        double numberOne = sc.nextDouble();

        System.out.print("Input a number: ");
        double numberTwo = sc.nextDouble();

        System.out.print("Input a number: ");
        double numberThree = sc.nextDouble();

        if(numberThree == 1) {
            System.out.println("Triangle area: " + Operations.areaTriangle(numberOne, numberTwo));
        } else {
        System.out.println("Rectangle area: " + Operations.areaRectangle(numberOne, numberTwo));
        }
    }

}
