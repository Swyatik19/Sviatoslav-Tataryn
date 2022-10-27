package homeWork13;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadAndSort {

    public static String pathToBooks = "src/books/" + title() + ".txt";
    public static String nameBookAndSum = pathToBooks.replaceAll("src/books/", "Name book { ");
    public static int count = 0;
    public static String pathToStatistic = "src/statistics/statistics.txt";

    public static String title() {
        System.out.println("Keep the title of the book");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void methodSorting() {
        boolean isFileExist = new File(pathToBooks).exists();
        System.out.println("File with name '" + pathToBooks + "' is exist : " + isFileExist + System.lineSeparator());
        Stream<Map.Entry<String, Integer>> entryStream;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(pathToBooks))) {
            String value = reader.readLine();
            String[] subStr = value.toLowerCase().split(" ");
            count = subStr.length;
            Map<String, Integer> statisticsMap = new HashMap<>();
            for (String strIterator : subStr) {
                if (!statisticsMap.containsKey(strIterator)) {
                    statisticsMap.put(strIterator, 1);
                } else {
                    statisticsMap.put(strIterator, statisticsMap.get(strIterator) + 1);
                }
            }
            entryStream = statisticsMap.entrySet().stream().filter(x -> x.getKey().length() > 2)
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(11);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String text = System.lineSeparator() + nameBookAndSum + " }, " + "length = " + count + " letters.";
        try {
            Files.write(Paths.get(pathToStatistic),
                    entryStream.map(k -> k.getKey() + " = " + k.getValue()).collect(Collectors.toList()),
                    StandardCharsets.UTF_8);
            Files.write(Paths.get(pathToStatistic), text.getBytes(), StandardOpenOption.APPEND);
            entryStream.close();
            Files.lines(Paths.get(pathToStatistic), StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
