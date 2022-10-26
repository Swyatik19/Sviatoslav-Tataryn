package homeWork5;

public class ReverseString {
    public static String STRING = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";


    public static String reverseLine() {
        String[] words = new StringBuilder(STRING).reverse().toString().split("Z");

        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        return newStr.toString();
    }
}
