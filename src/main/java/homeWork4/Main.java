package homeWork4;

import static homeWork4.Task.checkNumberTask_7;
import static homeWork4.Task.checkSumSignTask_3;
import static homeWork4.Task.compareIntegerNumbersTask_8;
import static homeWork4.Task.compareNumbersBooleanTask_6;
import static homeWork4.Task.compareNumbersTask_5;
import static homeWork4.Task.isLeapYearTask_10;
import static homeWork4.Task.printColorTask_4;
import static homeWork4.Task.printStringTask_9;
import static homeWork4.Task.printThreeWordsTask_2;
import static homeWork4.Task.randomVariable;


public class Main {
    public static final String[] THREE_WORDS_OUTPUT = {"Orange", "Banana", "Apple"};
    public static final String PRINT_TEXT = "Hello World !";
    public static final int COUNT = 5;

    public static void main(String[] args) {

        System.out.println();
        printThreeWordsTask_2(THREE_WORDS_OUTPUT);
        System.out.println();

        checkSumSignTask_3();
        System.out.println();

        printColorTask_4();
        System.out.println();

        compareNumbersTask_5();
        System.out.println();

        System.out.println(compareNumbersBooleanTask_6(randomVariable));
        System.out.println(randomVariable);
        System.out.println();

        checkNumberTask_7();
        System.out.println();

        System.out.println(compareIntegerNumbersTask_8());
        System.out.println(randomVariable);
        System.out.println();

        printStringTask_9(PRINT_TEXT, COUNT);
        System.out.println();

        isLeapYearTask_10();
        System.out.println();
    }
}
