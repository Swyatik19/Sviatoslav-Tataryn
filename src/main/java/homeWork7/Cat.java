package homeWork7;

public class Cat extends Animals {

    public static int catCount;

    @Override
    public void numberOfObjects(int catCount) {
        System.out.println(catCount + FILL_TEXT + " Cat");
    }

    public Cat(String name, int lengthOfTrans) {
        super(name, lengthOfTrans);
        catCount++;
    }

    @Override
    public void possibilityToSwim() {
        System.out.println(getName() + "there is a cat and he can't swim," +
                " take him out of the water)))");
    }

    @Override
    public void run(int lengthOfTrans) {
        if (lengthOfTrans >= 0 && lengthOfTrans <= 200) {
            System.out.println(getName() + " run " + lengthOfTrans + " m.");
        }
    }

}
