package homeWork10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static homeWork10.MyRealization.calcOccurance;
import static homeWork10.MyRealization.countOccurance;
import static homeWork10.MyRealization.findOccurance;
import static homeWork10.MyRealization.findUnique;

public class Main {


    public static void main(String[] args) {
        List<Integer> gasList = new ArrayList<>();
        gasList.add(1);
        gasList.add(2);
        gasList.add(1);
        gasList.add(4);
        gasList.add(4);
        gasList.add(1);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("John");
        arrayList.add("John");
        arrayList.add("John");
        arrayList.add("Anna");
        String word = "John";

        List<String> list = Arrays.asList(
                "Bird", "Fox", "Cat", "Fox", "Fox",
                "Bird", "Cat", "Bird", "Bird", "Bird",
                "Bird", "Bird", "Cat", "Bird", "Fox");


        System.out.println(countOccurance(arrayList, word));
        System.out.println(findUnique(gasList));
        System.out.println(calcOccurance(list));
        System.out.println(findOccurance(list));
    }
}
