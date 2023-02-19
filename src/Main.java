import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        String text1 = "Hello Java world";
        String text2 = "Hello Python world";
        BiFunction<String,String,String[]> fun1 = (a,b) -> findIdenticalWords(text1, text2);
        System.out.println(Arrays.toString(fun1.apply(text1, text2)));
    }

    private static String[] findIdenticalWords(String s1, String s2) {
        String resultString = "";
        HashMap<String, String> checkDuplication = new HashMap<>();
        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");

        for (String str1 : s1Array) {
            for (String str2 : s2Array) {
                if (str1.equals(str2) && !checkDuplication.containsKey(str1)) {
                    checkDuplication.put(str1, str1);
                    resultString += str2 + " ";
                }
            }
        }
        return resultString.split(" ");
    }
}
