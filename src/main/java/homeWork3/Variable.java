package homeWork3;


import static homeWork3.MonoBank.deposit;
import static homeWork3.MonoBank.interest;
import static homeWork3.MonoBank.lastName;
import static homeWork3.MonoBank.name;
import static homeWork3.MonoBank.year;

public class Variable {
    public final static String HELLO1 = "you are welcomed by the -mono bank-";
    public final static String HELLO2 = "program for calculating the interest rate on the deposit";
    public final static String NAME = name();
    public final static String LAST_NAME = lastName();
    public final static float DEPOSIT = deposit();
    public final static float INTEREST = interest();
    public final static int HUNDRED = 100;
    public final static int YEAR = year();
    public final static String WRITE_NAME = "* Enter your name";
    public final static String WRITE_LAST_NAME = "* Enter your last name";
    public final static String WRITE_DEPOSIT = "* Enter your deposit";
    public final static String WRITE_PROCENT = "* Enter your interest-(%) rate";
    public final static String WRITE_YEARS = "* Enter the number of years";
}
