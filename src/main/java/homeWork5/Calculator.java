package homeWork5;

import java.util.Scanner;

class Calculator {
    private final static int STOP = 000101;
    private final static int INCORRECTLY_ENTERED_DATA = 01;


    public static void calculator() {
        int output = 0;
        while (output != STOP) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(System.lineSeparator() + "   *Calculator*");
            System.out.println("Write first number: ");
            int first = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter an operation on numbers:  +   -   /   *");
            String character = (scanner.nextLine());
            System.out.println("Write second number: ");
            int second = Integer.parseInt(scanner.nextLine());

            output = switch (character) {
                case "+" -> first + second;
                case "-" -> first - second;
                case "/" -> first / second;
                case "*" -> first * second;
                case "exit" -> STOP;
                default -> INCORRECTLY_ENTERED_DATA;
            };

            if (output != INCORRECTLY_ENTERED_DATA) {
                System.out.println("You sum (" + first + " " + character
                        + " " + second + ") " + "= " + output
                        + System.lineSeparator());
            } else {
                System.out.println("You have entered incorrect data");
            }
        }
    }
}

