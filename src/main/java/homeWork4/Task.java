package homeWork4;

public class Task {

    public static final int zero = 0;
    public static int randomLeapYear = ((int) (Math.random() * 5000) + 1000);
    public static int randomVariableA = ((int) (Math.random() * 200) - 50);
    public static int randomVariableB = ((int) (Math.random() * 200) - 50);
    public static int randomVariable = ((int) (Math.random() * 200) - 50);

    public static int sumOfRandomNumbers() {
        return randomVariableA + randomVariableB;
    }

    public static void printThreeWordsTask_2(String[] THREE_WORDS_OUTPUT) {
        for (String word : THREE_WORDS_OUTPUT) {
            System.out.println(word);
        }
    }

    public static void checkSumSignTask_3() {
        System.out.println(sumOfRandomNumbers() >= zero ? "Сума " + sumOfRandomNumbers() + " позитивна" : "Сума " + sumOfRandomNumbers() + " негативна");
    }

    public static void printColorTask_4() {
        System.out.println(randomVariable < 0 ? "Червоний" : randomVariable < 100 ? "Жовтий" : "Зелений");
    }

    public static boolean compareNumbersTask_5() {
        System.out.println(randomVariableA >= randomVariableB ? "a >= b" : "a < b");
        System.out.println("a = " + randomVariableA + " ; b = " + randomVariableB);
        return false;
    }

    public static boolean compareNumbersBooleanTask_6(int randomVariable) {
        return randomVariable >= 10 && randomVariable <= 20;
    }

    public static void checkNumberTask_7() {
        System.out.println(randomVariable < zero ? randomVariable + " негативне число" : randomVariable + " позитивне число");
    }

    public static boolean compareIntegerNumbersTask_8() {
        return randomVariable < zero;
    }

    public static void printStringTask_9(String str, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(i + ". " + str);
        }
    }

    public static void isLeapYearTask_10() {
        System.out.println(((randomLeapYear
                % 4 == zero) && (randomLeapYear % 100 != zero) || (randomLeapYear % 400 == zero)));
        System.out.println(randomLeapYear);
    }
}
