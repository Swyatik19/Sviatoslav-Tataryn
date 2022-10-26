package homeWork7;

public abstract class Animals {

    private final String name;
    private final int lengthOfTrans;
    public static int animalsCount;
    public static final String FILL_TEXT = " objects were created in class";

    public Animals(String name, int lengthOfTrans) {
        this.name = name;
        this.lengthOfTrans = lengthOfTrans;
        animalsCount++;
    }

    public String getName() {
        return name;
    }

    public int getLengthOfTrans() {
        return lengthOfTrans;
    }

    public void possibilityToSwim(int swimmingLength) {
    }

    public void possibilityToSwim() {
    }

    public void numberOfObjects(int animalsCount) {
    }

    public abstract void run(int lengthOfTrans);

    public static void totalNumberOfObjects(int animalsCount) {
        System.out.println(animalsCount + FILL_TEXT + "Animals");
    }
}
