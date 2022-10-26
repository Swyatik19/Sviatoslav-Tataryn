package homeWork7;

public class Dog extends Animals {

    public static int dogCount;

    public Dog(String name, int lengthOfTrans) {
        super(name, lengthOfTrans);
        dogCount++;
    }

    public void numberOfObjects(int dogCount) {
        System.out.println(dogCount + FILL_TEXT + " Dog");
    }

    @Override
    public void possibilityToSwim(int swimmingLength) {
        if (swimmingLength > 0 && swimmingLength <= 500) {
            System.out.println(getName() + " swam: " + swimmingLength + " m.");
        }
    }

    @Override
    public void run(int lengthOfTrans) {
        System.out.println(getName() + " run: " + lengthOfTrans + " m.");
    }
}
