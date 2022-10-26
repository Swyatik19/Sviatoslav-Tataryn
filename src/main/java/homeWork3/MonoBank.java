package homeWork3;

import java.util.Scanner;

import static homeWork3.Variable.DEPOSIT;
import static homeWork3.Variable.HELLO1;
import static homeWork3.Variable.HELLO2;
import static homeWork3.Variable.HUNDRED;
import static homeWork3.Variable.INTEREST;
import static homeWork3.Variable.LAST_NAME;
import static homeWork3.Variable.NAME;
import static homeWork3.Variable.WRITE_DEPOSIT;
import static homeWork3.Variable.WRITE_LAST_NAME;
import static homeWork3.Variable.WRITE_NAME;
import static homeWork3.Variable.WRITE_PROCENT;
import static homeWork3.Variable.WRITE_YEARS;
import static homeWork3.Variable.YEAR;

public class MonoBank {
    public static void main(String[] args) {
        hello();
        derivationOfInitials();
        sum();
    }

    public static void hello() {
        System.out.println(System.lineSeparator() + HELLO1.toUpperCase()
                + System.lineSeparator() + HELLO2.toUpperCase() + System.lineSeparator());
    }

    public static String name() {
        System.out.println(WRITE_NAME);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String lastName() {
        System.out.println(WRITE_LAST_NAME);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static float deposit() {
        System.out.println(WRITE_DEPOSIT);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    public static int year() {
        System.out.println(WRITE_YEARS);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static float interest() {
        System.out.println(WRITE_PROCENT);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    public static void sum() {
        float sum = 0;
        int countYears = 1;
        for (int i = 0; i < YEAR; i++) {
            sum += DEPOSIT / HUNDRED * INTEREST;
            System.out.println(countYears + " year you are credited with " + "-"
                    + sum + "-" + " the amount is "
                    + (DEPOSIT * countYears + sum + ";"));
            if (countYears <= YEAR) {
                countYears++;
            }
        }
        System.out.println(System.lineSeparator() + "-Total after " + YEAR + " years "
                + (sum + DEPOSIT * YEAR));
    }

    public static void derivationOfInitials() {
        System.out.println(NAME + " " + LAST_NAME + " here is your calculation table: "
                + System.lineSeparator() + " -With contribution " + DEPOSIT
                + System.lineSeparator() + " -Under " + INTEREST + " % per annul. "
                + System.lineSeparator() + " -For a period of " + YEAR + " years."
                + System.lineSeparator());
    }
}

