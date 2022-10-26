package homeWork7;

import static homeWork7.Animals.animalsCount;
import static homeWork7.Animals.totalNumberOfObjects;
import static homeWork7.Cat.catCount;
import static homeWork7.Dog.dogCount;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        Animals dogBobi = new Dog("Bobi", 150);
        dogBobi.run(dogBobi.getLengthOfTrans());
        dogBobi.possibilityToSwim(100);
        dogBobi.numberOfObjects(dogCount);
        System.out.println();

        Animals catTommy = new Cat("Tommy", 200);
        catTommy.run(catTommy.getLengthOfTrans());
        catTommy.possibilityToSwim();
        catTommy.numberOfObjects(catCount);
        System.out.println();

        totalNumberOfObjects(animalsCount);
        System.out.println();

    }
}
