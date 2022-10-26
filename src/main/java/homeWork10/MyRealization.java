package homeWork10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MyRealization {
    public static int countOccurance(List<String> arrayList, String word) {
        return Collections.frequency(arrayList, word);
    }

    public static Set<Integer> findUnique(List<Integer> gasList) {
        Set<Integer> uniqueGas = new HashSet<>(gasList);
        return uniqueGas;
    }

    public static Map<String, Integer> calcOccurance(List<String> list) {
        Map<String, Integer> frequency = list.stream()
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        return frequency;
    }

    public static List<String> findOccurance(List<String> arrayList) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> frequency = arrayList.stream()
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        frequency.forEach((k, v) -> res.add(System.lineSeparator()
                + "{назва: " + k + ", " + "випадковість: " + v + "}"));
        return res;
    }
}
