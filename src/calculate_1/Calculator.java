package calculate_1;

import java.util.Scanner;

public class Calculator {

    int a = 10;
    int b = 20;


    public void addition() {
        System.out.println(a + b);
    }

    public void subtraction() {
        System.out.println(a - b);
    }

    public void division() {
        System.out.println(a / b);
    }

    public void multiplication() {
        System.out.println(a * b);
    }

    public void calculatorResult(int a, int b, char symbol) {

        if (symbol == '+') {
            addition();

        } else if (symbol == '-') {
            subtraction();

        } else if (symbol == '*') {
            multiplication();

        } else if (symbol == '/') {
            division();
        }
    }


    public static void main(String[] args) {

        char ch;

        Calculator t = new Calculator();
        t.addition();
        t.subtraction();
        t.division();
        t.multiplication();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number");

            int a = scanner.nextInt();
            System.out.println("Enter the second number");

            int b = scanner.nextInt();
            System.out.println("Do you want to continue : y or n");

            char charAt = scanner.next().charAt(0);

           // Calculator t = new Calculator();
            t.addition();
            t.subtraction();
            t.division();
            t.multiplication();
        }
    }



